package com.snapchat.wrapper.snapchatwrapper.domain.service;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapResult;
import com.snapchat.wrapper.snapchatwrapper.domain.client.SnapchatClient;

import java.io.IOException;

public class DomainSnapchatService implements SnapchatService {

    private final SnapchatClient snapchatClient;

    public DomainSnapchatService(SnapchatClient snapchatClient) {
        this.snapchatClient = snapchatClient;
    }

    @Override
    public SnapResult search(String username) throws IOException, InterruptedException {
        return snapchatClient.searchByUsername(username);
    }
}
