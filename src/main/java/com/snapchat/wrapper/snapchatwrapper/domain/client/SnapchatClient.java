package com.snapchat.wrapper.snapchatwrapper.domain.client;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapResult;

import java.io.IOException;

public interface SnapchatClient {
    SnapResult searchByUsername(String username) throws IOException, InterruptedException;
}
