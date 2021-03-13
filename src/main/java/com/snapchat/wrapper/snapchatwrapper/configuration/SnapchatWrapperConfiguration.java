package com.snapchat.wrapper.snapchatwrapper.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.snapchat.wrapper.snapchatwrapper.*")
@Configuration
@PropertySource(value = "classpath:snapchat-wrapper.yaml")
public class SnapchatWrapperConfiguration {
}
