package com.snapchat.wrapper.snapchatwrapper.infrastructure.mapper;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapResult;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.dto.SnapResultClientDto;

// TODO : @Service and test
public class SnapResultMapper {

    public static SnapResult fromDto(SnapResultClientDto dto) {
        if (dto == null) {
            return null;
        }
        return SnapResult
                .builder()
                .withEmoji(dto.getEmoji())
                .withIsOfficial(dto.isOfficial())
                .withIsPopular(dto.isPopular())
                .withLensInfo(dto.getLensInfo())
                .withSnapList(SnapListMapper.fromDtos(dto.getSnapList()))
                .withStoryID(dto.getStoryID())
                .withStoryTitle(dto.getStoryTitle())
                .withStoryType(dto.getStoryType())
                .withThumbnailUrl(dto.getThumbnailUrl())
                .withTimestampInSec(dto.getTimestampInSec())
                .withUserName(dto.getUserName())
                .build();
    }

}
