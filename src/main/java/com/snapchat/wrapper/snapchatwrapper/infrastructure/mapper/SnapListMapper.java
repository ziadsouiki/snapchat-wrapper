package com.snapchat.wrapper.snapchatwrapper.infrastructure.mapper;

import com.snapchat.wrapper.snapchatwrapper.domain.SnapList;
import com.snapchat.wrapper.snapchatwrapper.infrastructure.dto.SnapListClientDto;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// TODO : @Service and test
public class SnapListMapper {

    public static SnapList fromDto(SnapListClientDto dto) {
        if (dto == null) {
            return null;
        }
        return SnapList
                .builder()
                .withSnapId(dto.getSnapId())
                .withSnapIndex(dto.getSnapIndex())
                .withSnapSubtitles(dto.getSnapSubtitles())
                .withSnapTitle(dto.getSnapTitle())
                .withSnapUrls(SnapUrlsMapper.fromDto(dto.getSnapUrls()))
                .withTimestampInSec(dto.getTimestampInSec())
                .build();
    }

    public static List<SnapList> fromDtos(List<SnapListClientDto> dtos) {
        if (CollectionUtils.isEmpty(dtos)) {
            return Collections.emptyList();
        }
        return dtos.stream().map(dto -> fromDto(dto)).collect(Collectors.toList());
    }

}
