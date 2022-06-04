package com.anker.serviceark.repository;

import com.anker.serviceark.bo.Plate;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface PlateRepository extends CrudRepository<Plate, Integer>, JpaSpecificationExecutor<Plate> {
}
