package eu.icole.portainer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
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
