package artProject;

import static ru.art.config.extensions.activator.AgileConfigurationsActivator.useAgileConfigurations;
import static ru.art.http.server.HttpServer.startHttpServer;
import static ru.art.http.server.function.HttpServiceFunction.httpGet;
import static ru.art.entity.PrimitiveMapping.StringPrimitive.fromModel;

public class App {
    public static void main(String[] args) {
        useAgileConfigurations(App.class.getName());
        httpGet("/hello")
                .responseMapper(fromModel)
                .produce(() -> "<h1>Hello, ART!</h1>");
        startHttpServer().await();
    }
}
