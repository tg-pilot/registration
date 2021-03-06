package io.mosip.registration.processor.packet.storage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTagRequestDto {

    private String id;
    private Map<String, String> tags;
}
