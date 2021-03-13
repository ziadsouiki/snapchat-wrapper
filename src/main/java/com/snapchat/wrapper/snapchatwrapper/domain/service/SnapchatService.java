package com.snapchat.wrapper.snapchatwrapper.domain.service;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapResult;

import java.io.IOException;

public interface SnapchatService {
    SnapResult search(String username) throws IOException, InterruptedException;
}
