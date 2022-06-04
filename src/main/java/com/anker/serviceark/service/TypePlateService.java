package com.anker.serviceark.service;

import com.anker.serviceark.bo.TypePlate;
import com.anker.serviceark.dto.TypePlateDto;
import com.anker.serviceark.repository.TypePlateRepository;
import com.anker.serviceark.tools.AnkerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class TypePlateService extends AnkerService<TypePlate, TypePlateDto, Integer> {

    @Autowired private TypePlateRepository repository;

    @Override
    public TypePlateDto toDto(TypePlate typePlate) {
        TypePlateDto dto = new TypePlateDto();
        BeanUtils.copyProperties(typePlate, dto);
        return dto;
    }

    @Override
    public TypePlate toBo(TypePlateDto typePlateDto) {
        TypePlate bo = new TypePlate();
        BeanUtils.copyProperties(typePlateDto, bo);
        return bo;
    }

    @Override
    public CrudRepository<TypePlate, Integer> getRepository() {
        return repository;
    }
}
