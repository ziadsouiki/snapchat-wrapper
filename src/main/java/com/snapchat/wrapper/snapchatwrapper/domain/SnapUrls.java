package com.snapchat.wrapper.snapchatwrapper.domain;

public class SnapUrls {
    private String mediaUrl;
    private String mediaPreviewUrl;
    private String snapMediaType;
    private String overlayUrl;

    public SnapUrls() {
    }

    public static SnapUrlsBuilder builder() {
        return new SnapUrlsBuilder();
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getMediaPreviewUrl() {
        return mediaPreviewUrl;
    }

    public String getSnapMediaType() {
        return snapMediaType;
    }

    public String getOverlayUrl() {
        return overlayUrl;
    }

    public static final class SnapUrlsBuilder {
        private String mediaUrl;
        private String mediaPreviewUrl;
        private String snapMediaType;
        private String overlayUrl;

        private SnapUrlsBuilder() {
        }

        public SnapUrlsBuilder withMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }

        public SnapUrlsBuilder withMediaPreviewUrl(String mediaPreviewUrl) {
            this.mediaPreviewUrl = mediaPreviewUrl;
            return this;
        }

        public SnapUrlsBuilder withSnapMediaType(String snapMediaType) {
            this.snapMediaType = snapMediaType;
            return this;
        }

        public SnapUrlsBuilder withOverlayUrl(String overlayUrl) {
            this.overlayUrl = overlayUrl;
            return this;
        }

        public SnapUrls build() {
            SnapUrls snapUrls = new SnapUrls();
            snapUrls.mediaUrl = this.mediaUrl;
            snapUrls.snapMediaType = this.snapMediaType;
            snapUrls.mediaPreviewUrl = this.mediaPreviewUrl;
            snapUrls.overlayUrl = this.overlayUrl;
            return snapUrls;
        }
    }
}
