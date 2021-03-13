package com.snapchat.wrapper.snapchatwrapper.infrastructure.mapper;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapUrls;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.dto.SnapUrlsClientDto;

// TODO : @Service and test
public class SnapUrlsMapper {

    public static SnapUrls fromDto(SnapUrlsClientDto dto) {
        if (dto == null) {
            return null;
        }
        return SnapUrls
                .builder()
                .withMediaPreviewUrl(dto.getMediaPreviewUrl())
                .withMediaUrl(dto.getMediaUrl())
                .withSnapMediaType(dto.getSnapMediaType())
                .withOverlayUrl(dto.getOverlayUrl())
                .build();
    }

}
