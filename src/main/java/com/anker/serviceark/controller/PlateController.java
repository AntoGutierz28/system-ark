package com.anker.serviceark.controller;

import com.anker.serviceark.bo.Plate;
import com.anker.serviceark.dto.PlateDto;
import com.anker.serviceark.tools.AnkerController;
import com.anker.serviceark.tools.AnkerService;
import com.anker.serviceark.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/service/plate")
public class PlateController extends AnkerController<Plate, PlateDto, Integer> {

    @Autowired private PlateService service;

    @Override
    public AnkerService<Plate, PlateDto, Integer> getService() {
        return service;
    }
}
