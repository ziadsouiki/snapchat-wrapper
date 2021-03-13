package com.snapchat.wrapper.snapchatwrapper;

import com.snapchat.wrapper.snapchatwrapper.configuration.SnapchatWrapperConfiguration;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.client.RestSnapchatClient;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SnapchatWrapperConfiguration.class)
@TestPropertySource(locations = "classpath:test-snapchat-wrapper.yaml")
class SnapchatWrapperApplicationTests {

    @Autowired
    RestSnapchatClient restSnapchatClient;
    /*
    @Test
    void contextLoads() throws IOException, InterruptedException {
        SnapResult snapResult = restSnapchatClient.searchByUsername("nishubhatt8881");

        Assertions.assertNotNull(snapResult);
        Assertions.assertNotNull(snapResult.getUserName());
    }

     */

}
