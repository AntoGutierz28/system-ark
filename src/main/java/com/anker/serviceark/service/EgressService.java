package com.anker.serviceark.service;

import com.anker.serviceark.bo.Egress;
import com.anker.serviceark.dto.EgressDto;
import com.anker.serviceark.repository.EgressRepository;
import com.anker.serviceark.tools.AnkerBean;
import com.anker.serviceark.tools.AnkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class EgressService extends AnkerService<Egress, EgressDto, Integer> {
     @Autowired private EgressRepository repository;

    @Override
    public EgressDto toDto(Egress egress) {
        EgressDto dto = new EgressDto();
        AnkerBean.copy(egress, dto);
        return dto;
    }

    @Override
    public Egress toBo(EgressDto egressDto) {
        Egress bo = new Egress();
        AnkerBean.copy(egressDto, bo);
        return bo;
    }

    @Override
    public CrudRepository<Egress, Integer> getRepository() {
        return repository;
    }
}
