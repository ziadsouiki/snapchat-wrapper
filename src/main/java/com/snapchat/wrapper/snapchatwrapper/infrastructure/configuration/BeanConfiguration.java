package com.snapchat.wrapper.snapchatwrapper.infrastructure.configuration;

import com.snapchat.wrapper.snapchatwrapper.domain.client.SnapchatClient;
import com.snapchat.wrapper.snapchatwrapper.domain.service.DomainSnapchatService;
import com.snapchat.wrapper.snapchatwrapper.domain.service.SnapchatService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;

@Component
public class BeanConfiguration {

    @Bean
    SnapchatService snapchatService(final SnapchatClient snapchatClient) {
        return new DomainSnapchatService(snapchatClient);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpClient httpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
    }
}
