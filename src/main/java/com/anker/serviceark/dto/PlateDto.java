package com.anker.serviceark.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PlateDto {
    private Integer id;
    private Long version;
    private String name;
    private Float price;
    private Integer stock;
    private TypePlateDto type;
}
