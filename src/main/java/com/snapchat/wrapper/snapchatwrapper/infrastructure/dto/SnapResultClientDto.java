package com.snapchat.wrapper.snapchatwrapper.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapResultClientDto {
    private String storyID;
    private String storyTitle;
    private String storyType;
    private String emoji;
    private String userName;
    private long timestampInSec;
    @JsonProperty("isOfficial")
    private boolean official;
    @JsonProperty("isPopular")
    private boolean popular;
    private String lensInfo;
    private List<String> thumbnailUrl;
    private List<SnapListClientDto> snapList;

    public String getStoryID() {
        return storyID;
    }

    public void setStoryID(String storyID) {
        this.storyID = storyID;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryType() {
        return storyType;
    }

    public void setStoryType(String storyType) {
        this.storyType = storyType;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTimestampInSec() {
        return timestampInSec;
    }

    public void setTimestampInSec(long timestampInSec) {
        this.timestampInSec = timestampInSec;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public String getLensInfo() {
        return lensInfo;
    }

    public void setLensInfo(String lensInfo) {
        this.lensInfo = lensInfo;
    }

    public List<String> getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(List<String> thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public List<SnapListClientDto> getSnapList() {
        return snapList;
    }

    public void setSnapList(List<SnapListClientDto> snapList) {
        this.snapList = snapList;
    }
}
