package com.anker.serviceark.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;

@Getter
@Setter
@ToString
public class EgressDto {
    private Integer id;
    private Integer version;
    private OffsetDateTime date;
    private Float amount;
}
