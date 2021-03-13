package com.snapchat.wrapper.snapchatwrapper.domain;

import java.util.List;

public class SnapResult {
    private String storyID;
    private String storyTitle;
    private String storyType;
    private String emoji;
    private String userName;
    private long timestampInSec;
    private boolean isOfficial;
    private boolean isPopular;
    private String lensInfo;
    private List<String> thumbnailUrl;
    private List<SnapList> snapList;

    private SnapResult() {
    }

    public static SnapResultBuilder builder() {
        return new SnapResultBuilder();
    }

    public String getStoryID() {
        return storyID;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public String getStoryType() {
        return storyType;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getUserName() {
        return userName;
    }

    public long getTimestampInSec() {
        return timestampInSec;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public String getLensInfo() {
        return lensInfo;
    }

    public List<String> getThumbnailUrl() {
        return thumbnailUrl;
    }

    public List<SnapList> getSnapList() {
        return snapList;
    }


    public static final class SnapResultBuilder {
        private String storyID;
        private String storyTitle;
        private String storyType;
        private String emoji;
        private String userName;
        private long timestampInSec;
        private boolean isOfficial;
        private boolean isPopular;
        private String lensInfo;
        private List<String> thumbnailUrl;
        private List<SnapList> snapList;

        private SnapResultBuilder() {
        }

        public SnapResultBuilder withStoryID(String storyID) {
            this.storyID = storyID;
            return this;
        }

        public SnapResultBuilder withStoryTitle(String storyTitle) {
            this.storyTitle = storyTitle;
            return this;
        }

        public SnapResultBuilder withStoryType(String storyType) {
            this.storyType = storyType;
            return this;
        }

        public SnapResultBuilder withEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }

        public SnapResultBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public SnapResultBuilder withTimestampInSec(long timestampInSec) {
            this.timestampInSec = timestampInSec;
            return this;
        }

        public SnapResultBuilder withIsOfficial(boolean isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }

        public SnapResultBuilder withIsPopular(boolean isPopular) {
            this.isPopular = isPopular;
            return this;
        }

        public SnapResultBuilder withLensInfo(String lensInfo) {
            this.lensInfo = lensInfo;
            return this;
        }

        public SnapResultBuilder withThumbnailUrl(List<String> thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public SnapResultBuilder withSnapList(List<SnapList> snapList) {
            this.snapList = snapList;
            return this;
        }

        public SnapResult build() {
            SnapResult snapResult = new SnapResult();
            snapResult.timestampInSec = this.timestampInSec;
            snapResult.thumbnailUrl = this.thumbnailUrl;
            snapResult.isPopular = this.isPopular;
            snapResult.lensInfo = this.lensInfo;
            snapResult.snapList = this.snapList;
            snapResult.storyTitle = this.storyTitle;
            snapResult.emoji = this.emoji;
            snapResult.isOfficial = this.isOfficial;
            snapResult.storyID = this.storyID;
            snapResult.userName = this.userName;
            snapResult.storyType = this.storyType;
            return snapResult;
        }
    }
}
