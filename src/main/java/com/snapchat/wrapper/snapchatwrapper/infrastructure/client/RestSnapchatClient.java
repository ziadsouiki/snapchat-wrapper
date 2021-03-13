package com.snapchat.wrapper.snapchatwrapper.infrastructure.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.snapchat.wrapper.snapchatwrapper.domain.SnapResult;
import com.snapchat.wrapper.snapchatwrapper.domain.client.SnapchatClient;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.dto.SnapResultClientDto;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.mapper.SnapResultMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

@Component
public class RestSnapchatClient implements SnapchatClient {

    private final HttpClient httpClient;

    @Value("${base}")
    private String baseUrl;

    public RestSnapchatClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public SnapResult searchByUsername(String username) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "lookupStory?id=" + username))
                .header("Accept-Encoding", "gzip")
                .build();
        HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
        String contentFromHttpResponse = getContentFromHttpResponse(response);
        // TODO : create an intermediary service for the transformation
        SnapResultClientDto snapResultClientDto = new ObjectMapper().readValue(contentFromHttpResponse, SnapResultClientDto.class);
        return SnapResultMapper.fromDto(snapResultClientDto);
    }

    public String getContentFromHttpResponse(HttpResponse<InputStream> response) throws IOException {
        GZIPInputStream gzipInputStream = new GZIPInputStream(response.body());
        String content = new String(gzipInputStream.readAllBytes(), StandardCharsets.UTF_8);
        return content;
    }

}
