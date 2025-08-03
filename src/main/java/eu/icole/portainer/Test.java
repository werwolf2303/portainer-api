package eu.icole.portainer;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Statistics;
import com.github.dockerjava.core.InvocationBuilder;
import eu.icole.portainer.dtos.EndpointsPostPayload;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okio.Buffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws PortainerException, IOException, NoSuchAlgorithmException, KeyManagementException, NoSuchFieldException, IllegalAccessException {
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[]{};
                    }
                }
        };
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new SecureRandom());

        OkHttpClient client = new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0])
                .hostnameVerifier((hostname, session) -> true)
                .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080)))
                .build();

        PortainerConnection connection = new PortainerConnection.Builder()
                .setHost("127.0.0.1")
                .setUseSsl(true)
                .setUser("admin")
                .setPassword("123456")
                .setOkHttpClient(client)
                .build();

        connection.connect();

        DockerClient dockerClient = connection.getDocker(3);

        for (Container container : dockerClient.listContainersCmd().exec()) {
            dockerClient.statsCmd(container.getId()).exec(new InvocationBuilder.AsyncResultCallback<Statistics>() {
                @Override
                public void onNext(Statistics object) {
                    System.out.println(object.toString());
                }
            });
        }
    }
}
