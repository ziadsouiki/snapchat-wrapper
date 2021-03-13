package com.snapchat.wrapper.snapchatwrapper.domain;

public class SnapList {
    private int snapIndex;
    private String snapTitle;
    private String snapSubtitles;
    private String snapId;
    private int timestampInSec;
    private SnapUrls snapUrls;

    private SnapList() {
    }

    public static SnapListBuilder builder() {
        return new SnapListBuilder();
    }

    public int getSnapIndex() {
        return snapIndex;
    }

    public String getSnapTitle() {
        return snapTitle;
    }

    public String getSnapSubtitles() {
        return snapSubtitles;
    }

    public String getSnapId() {
        return snapId;
    }

    public int getTimestampInSec() {
        return timestampInSec;
    }

    public SnapUrls getSnapUrls() {
        return snapUrls;
    }

    public static final class SnapListBuilder {
        private int snapIndex;
        private String snapTitle;
        private String snapSubtitles;
        private String snapId;
        private int timestampInSec;
        private SnapUrls snapUrls;

        private SnapListBuilder() {
        }

        public SnapListBuilder withSnapIndex(int snapIndex) {
            this.snapIndex = snapIndex;
            return this;
        }

        public SnapListBuilder withSnapTitle(String snapTitle) {
            this.snapTitle = snapTitle;
            return this;
        }

        public SnapListBuilder withSnapSubtitles(String snapSubtitles) {
            this.snapSubtitles = snapSubtitles;
            return this;
        }

        public SnapListBuilder withSnapId(String snapId) {
            this.snapId = snapId;
            return this;
        }

        public SnapListBuilder withTimestampInSec(int timestampInSec) {
            this.timestampInSec = timestampInSec;
            return this;
        }

        public SnapListBuilder withSnapUrls(SnapUrls snapUrls) {
            this.snapUrls = snapUrls;
            return this;
        }

        public SnapList build() {
            SnapList snapList = new SnapList();
            snapList.snapId = this.snapId;
            snapList.snapIndex = this.snapIndex;
            snapList.snapTitle = this.snapTitle;
            snapList.timestampInSec = this.timestampInSec;
            snapList.snapSubtitles = this.snapSubtitles;
            snapList.snapUrls = this.snapUrls;
            return snapList;
        }
    }
}
