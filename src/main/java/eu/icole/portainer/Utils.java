package eu.icole.portainer;

import com.google.gson.Gson;
import eu.icole.portainer.dtos.release.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public static MultipartBody deserializeToFormData(Object clazz) throws IllegalAccessException, NoSuchFieldException {
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (Field field : clazz.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType().isEnum()) {
                builder.addFormDataPart(field.getName(), extractValueFromEnumItem(field.get(clazz)).toString());
            } else {
                Object value = field.get(clazz);
                if (value == null || value.toString().isEmpty()) {
                    continue;
                }
                if (value instanceof File) {
                    java.io.File file = (java.io.File) value;
                    MediaType mediaType = MediaType.parse("application/octet-stream");
                    builder.addFormDataPart(field.getName(), file.getName(), RequestBody.create(file, mediaType));
                } else if (value instanceof List) {
                    List<?> list = (List<?>) value;
                    if (list.isEmpty()) continue;
                    Object type = list.get(0);
                    if (type instanceof File) {
                        for (Object item : list) {
                            java.io.File file = (java.io.File) item;
                            MediaType mediaType = MediaType.parse("application/octet-stream");
                            builder.addFormDataPart(field.getName(), file.getName(), RequestBody.create(file, mediaType));
                        }
                    } else if (type.getClass().isEnum()) {
                        for (Object item : list) {
                            builder.addFormDataPart(field.getName(), extractValueFromEnumItem(item).toString());
                        }
                    } else {
                        for (Object item : list) {
                            builder.addFormDataPart(field.getName(), item.toString());
                        }
                    }
                } else builder.addFormDataPart(field.getName(), value.toString());
            }
        }

        return builder.build();
    }

    public static Object extractValueFromEnumItem(Object item) throws IllegalAccessException {
        for (Field field : item.getClass().getDeclaredFields()) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                return field.get(item);
            }
        }
        return item.toString();
    }

    public static String formatUrl(String url, Object... args) {
        StringBuilder builder = new StringBuilder(url.split("\\?")[0] + "?");
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)=([^&]*)");
        Matcher matcher = pattern.matcher(url);

        int count = 0;
        while (matcher.find()) {
            if (args[count] == null) {
                count++;
                continue;
            }
            if (args[count] == "") {
                count++;
                continue;
            }
            String key = matcher.group(1);
            builder.append(key).append("=").append(args[count]).append("&");
            count++;
        }

        return builder.substring(0, builder.length() - 1);
    }
}
