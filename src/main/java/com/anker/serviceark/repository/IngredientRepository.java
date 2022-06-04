package com.anker.serviceark.repository;

import com.anker.serviceark.bo.Ingredient;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer>, JpaSpecificationExecutor<Ingredient> {
}
