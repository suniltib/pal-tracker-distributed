package io.pivotal.pal.tracker.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;
import zipkin.server.EnableZipkinServer;

@EnableZipkinStreamServer
@EnableZipkinServer
@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.zipkinserver")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}