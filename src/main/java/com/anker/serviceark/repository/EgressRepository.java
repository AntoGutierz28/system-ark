package com.anker.serviceark.repository;

import com.anker.serviceark.bo.Egress;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EgressRepository extends CrudRepository<Egress, Integer>, JpaSpecificationExecutor<Egress> {
}
