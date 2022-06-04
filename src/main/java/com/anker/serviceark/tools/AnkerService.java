package com.anker.serviceark.tools;

import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AnkerService<Bo, Dto, Id> {

    public abstract Dto toDto(Bo bo);

    public abstract Bo toBo(Dto dto);

    public abstract CrudRepository<Bo, Id> getRepository();

    public Dto findById(Id id) throws Exception {
        Optional<Bo> bo = getRepository().findById(id);
        if (bo.isEmpty()) {
            throw new Exception();
        }
        return toDto(bo.get());
    }

    public List<Dto> findAll() {
        List<Bo> listBo = (List) getRepository().findAll();
        List<Dto> listDto = new ArrayList<>();
        if (!listBo.isEmpty()) {
            listBo.forEach(bo -> {
                Dto dto = toDto(bo);
                listDto.add(dto);
            });
        }
        return listDto;
    }

    public void deleteById(Id id) throws Exception {
        if (!getRepository().existsById(id)) {
            throw new Exception();
        }
        getRepository().deleteById(id);
    }

    public void preCreate(Dto dto) {}

    public void postCreate(Bo bo){}


    public Dto create(Dto dto) throws Exception {
        preCreate(dto);
        Bo bo = toBo(dto);
        bo = getRepository().save(bo);
        postCreate(bo);
        dto = toDto(bo);
        return dto;
    }

    public Dto preUpdate(Dto dto, Id id) {
        Bo bo = getRepository().findById(id).get();
        Dto currentDto = toDto(bo);
        AnkerBean.copy(dto, currentDto);
        return currentDto;
    }

    public void postUpdate(Bo bo, Id id) {}

    public Dto update(Dto dto, Id id) throws Exception {
        if (!getRepository().existsById(id)) {
            throw new Exception();
        }
        dto = preUpdate(dto, id);
        Bo bo = toBo(dto);
        bo = getRepository().save(bo);
        postUpdate(bo, id);
        return toDto(bo);
    }
}
