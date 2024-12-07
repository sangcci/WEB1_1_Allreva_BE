package com.backend.allreva.hall.command.domain.value;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Location {

    private Double longitude;
    private Double latitude;

    private String address;
}