package com.snapchat.wrapper.snapchatwrapper.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapListClientDto {
    private int snapIndex;
    private String snapTitle;
    private String snapSubtitles;
    private String snapId;
    private int timestampInSec;
    private SnapUrlsClientDto snapUrls;

    public int getSnapIndex() {
        return snapIndex;
    }

    public void setSnapIndex(int snapIndex) {
        this.snapIndex = snapIndex;
    }

    public String getSnapTitle() {
        return snapTitle;
    }

    public void setSnapTitle(String snapTitle) {
        this.snapTitle = snapTitle;
    }

    public String getSnapSubtitles() {
        return snapSubtitles;
    }

    public void setSnapSubtitles(String snapSubtitles) {
        this.snapSubtitles = snapSubtitles;
    }

    public String getSnapId() {
        return snapId;
    }

    public void setSnapId(String snapId) {
        this.snapId = snapId;
    }

    public int getTimestampInSec() {
        return timestampInSec;
    }

    public void setTimestampInSec(int timestampInSec) {
        this.timestampInSec = timestampInSec;
    }

    public SnapUrlsClientDto getSnapUrls() {
        return snapUrls;
    }

    public void setSnapUrls(SnapUrlsClientDto snapUrls) {
        this.snapUrls = snapUrls;
    }
}
