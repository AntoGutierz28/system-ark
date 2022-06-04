package com.anker.serviceark.repository;

import com.anker.serviceark.bo.ItemSale;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ItemSaleRepository extends CrudRepository<ItemSale, Integer>, JpaSpecificationExecutor<ItemSale> {
}
