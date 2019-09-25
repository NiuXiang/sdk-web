package com.great.config;
import com.great.GtControllerSdk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SdkConfig {
    @Bean(initMethod = "initControllerSdk", destroyMethod = "destroyControllerSdk")
    public GtControllerSdk gtControllerSdk() {
        String initParam = "<SERVER_PORT>6666</SERVER_PORT>" +
                "<SERVER_ID>123456789012</SERVER_ID>";
        return new GtControllerSdk(initParam);
    }
}
