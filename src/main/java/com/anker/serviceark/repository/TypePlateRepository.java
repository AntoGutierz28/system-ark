package com.anker.serviceark.repository;

import com.anker.serviceark.bo.TypePlate;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TypePlateRepository  extends CrudRepository<TypePlate, Integer>, JpaSpecificationExecutor<TypePlate> {
}
