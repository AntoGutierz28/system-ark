package com.anker.serviceark.controller;

import com.anker.serviceark.bo.TypePlate;
import com.anker.serviceark.dto.TypePlateDto;
import com.anker.serviceark.tools.AnkerController;
import com.anker.serviceark.tools.AnkerService;
import com.anker.serviceark.service.TypePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/service/type-plate")
public class TypePlateController extends AnkerController<TypePlate, TypePlateDto, Integer> {

    @Autowired private TypePlateService service;

    @Override
    public AnkerService<TypePlate, TypePlateDto, Integer> getService() {
        return service;
    }
}
