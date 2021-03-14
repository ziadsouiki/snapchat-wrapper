## Overview

This project is a Java Wrapper for the unofficial snapchat API (https://story.snapchat.com/). It provides a fluent interface for requesting the API.

## Usage

The library can be used with Java 11 or newer.

not available yet in Maven Central

The wrapper use the following HTTP clients:

- java.net httpclient


you can add an implementation by implementing SnapchatClient in the infrastructure.client package

### Init

First, add dependency in your pom and add @EnableSnapchatWrapper to activatec component scan

```java
import com.snapchat.wrapper.snapchatwrapper.configuration.EnableSnapchatWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSnapchatWrapper
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
```

### Usage

inject the SnapchatService service using spring dependency injection:
```java
@Component
public class Test {
   private final SnapchatService snapchatService;

    public Test(SnapchatService snapchatService) {
        this.snapchatService = snapchatService;
    }
}
```
you can now use the service
```java
  public SnapResult connectToSnapchat(String username) throws IOException, InterruptedException {
        SnapResult snapResult = this.snapchatService.search(username);
        return snapResult;
  }
```

example output of unofficial search api which will be converted to pojo SnapResult
```json
{
  "storyID": "c:LCXi7xSF4KpI_-5isPmAMHLiAVNtjpa7C-iMhs9pDg80JQ7tE1Kxph7T6Q",
  "storyTitle": "Nisha Bhatt",
  "storyType": "TYPE_PUBLIC_USER_STORY",
  "emoji": "⭐",
  "isOfficial": true,
  "isPopular": true,
  "thumbnailUrl": [
    "https://s.sc-cdn.net/1d/41kKs7rIlO1mGG8pcjc3GaxsENdE5HZDgs4Btptfpvg=/default/preview.jpg",
    "https://s.sc-cdn.net/1d/Z0ppfSqqzdtt6z1yiDExjhRmJ-Sv2BolU1wB_gkkJIQ=/default/preview_overlay.jpg"
  ],
  "userName": "nishubhatt8881",
  "timestampInSec": 0,
  "snapList": [
    {
      "snapIndex": 0,
      "snapTitle": "",
      "snapSubtitles": "⭐",
      "snapId": "PbbfUkHxRL2_V5uPmPghMgAAgh57sqEAAb9a_AXgp1g2UAXgp1gai_____w",
      "timestampInSec": 1615609595,
      "snapUrls": {
        "mediaUrl": "https://s.sc-cdn.net/1d/41kKs7rIlO1mGG8pcjc3GaxsENdE5HZDgs4Btptfpvg=/default/media.mp4",
        "mediaPreviewUrl": "",
        "snapMediaType": "",
        "overlayUrl": ""
      }
    },
    {
      "snapIndex": 1,
      "snapTitle": "",
      "snapSubtitles": "⭐",
      "snapId": "PbbfUkHxRL2_V5uPmPghMgAAgI6I8wpwkvyPGAXgqTcaFAXgqTby1_____w",
      "timestampInSec": 1615617440,
      "snapUrls": {
        "mediaUrl": "https://s.sc-cdn.net/1d/Z0ppfSqqzdtt6z1yiDExjhRmJ-Sv2BolU1wB_gkkJIQ=/default/media.mp4",
        "mediaPreviewUrl": "",
        "snapMediaType": "",
        "overlayUrl": "https://s.sc-cdn.net/1d/Z0ppfSqqzdtt6z1yiDExjhRmJ-Sv2BolU1wB_gkkJIQ=/default/overlay.png"
      }
    },
    {
      "snapIndex": 2,
      "snapTitle": "",
      "snapSubtitles": "⭐",
      "snapId": "PbbfUkHxRL2_V5uPmPghMgAAgStkoTfx_k7fTAXgsd9xuAXgsd9iv_____w",
      "timestampInSec": 1615653755,
      "snapUrls": {
        "mediaUrl": "https://s.sc-cdn.net/1d/Hz-NldFTRQimDkRrC38mhBrW-JLbA7HgTykcjTlqvpc=/default/media.jpg?Expires=1615746002&KeyName=test-key&Signature=F7RiQofi0RgbB5z-cqSmyqMQkd4=",
        "mediaPreviewUrl": "",
        "snapMediaType": "",
        "overlayUrl": ""
      }
    },
    {
      "snapIndex": 3,
      "snapTitle": "",
      "snapSubtitles": "⭐",
      "snapId": "PbbfUkHxRL2_V5uPmPghMgAAgidyjhSqVlgkrAXgsm_vdAXgsm_ce_____w",
      "timestampInSec": 1615656122,
      "snapUrls": {
        "mediaUrl": "https://s.sc-cdn.net/1d/rycMArjsc23nt23T5HBUWWpF2xLcRxEB3MPsDGggPIY=/default/media.jpg?Expires=1615746002&KeyName=test-key&Signature=kXlVsSRPAF9e-EZgXJ7gukcLfJg=",
        "mediaPreviewUrl": "",
        "snapMediaType": "",
        "overlayUrl": ""
      }
    }
  ],
  "lensInfo": null
}
```
## Implementation Status

| Method                    | Impl | Unit Test  | Int Test |
| ------------------------- | :--: | :--------: | :------: |
| GET lookupStory?id | Yes | No | No

## TODO
- add to maven central
- add exception (currently no exceptions are handled)