package com.anker.serviceark.service;

import com.anker.serviceark.bo.Plate;
import com.anker.serviceark.bo.TypePlate;
import com.anker.serviceark.dto.PlateDto;
import com.anker.serviceark.dto.TypePlateDto;
import com.anker.serviceark.repository.PlateRepository;
import com.anker.serviceark.repository.TypePlateRepository;
import com.anker.serviceark.tools.AnkerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PlateService extends AnkerService<Plate, PlateDto, Integer> {

    @Autowired private PlateRepository repository;
    @Autowired private TypePlateRepository typePlateRepository;

    @Override
    public PlateDto toDto(Plate plate) {
        PlateDto dto = new PlateDto();
        BeanUtils.copyProperties(plate, dto);
        TypePlateDto typeDto = new TypePlateDto();
        BeanUtils.copyProperties(plate.getType(), typeDto);
        dto.setType(typeDto);
        return dto;
    }

    @Override
    public Plate toBo(PlateDto plateDto) {
        Plate bo = new Plate();
        BeanUtils.copyProperties(plateDto, bo);
        if (!typePlateRepository.existsById(plateDto.getType().getId())) {
            throw new RuntimeException();
        }
        TypePlate typeBo = typePlateRepository.findById(plateDto.getType().getId()).get();
//        TypePlate typeBo = new TypePlate();
//        BeanUtils.copyProperties(plateDto.getType(), typeBo);
        bo.setType(typeBo);
        return bo;
    }

    @Override
    public CrudRepository<Plate, Integer> getRepository() {
        return repository;
    }
}
