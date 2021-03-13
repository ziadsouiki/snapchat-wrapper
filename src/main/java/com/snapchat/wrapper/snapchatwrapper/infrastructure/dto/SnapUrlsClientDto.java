package com.snapchat.wrapper.snapchatwrapper.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapUrlsClientDto {
    private String mediaUrl;
    private String mediaPreviewUrl;
    private String snapMediaType;
    private String overlayUrl;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaPreviewUrl() {
        return mediaPreviewUrl;
    }

    public void setMediaPreviewUrl(String mediaPreviewUrl) {
        this.mediaPreviewUrl = mediaPreviewUrl;
    }

    public String getSnapMediaType() {
        return snapMediaType;
    }

    public void setSnapMediaType(String snapMediaType) {
        this.snapMediaType = snapMediaType;
    }

    public String getOverlayUrl() {
        return overlayUrl;
    }

    public void setOverlayUrl(String overlayUrl) {
        this.overlayUrl = overlayUrl;
    }
}
