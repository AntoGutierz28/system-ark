package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ARK_INGREDIENT")
@NamedQuery(name = "Ingredient.findByPK", query = "Select i from Ingredient i where i.id = ?1")
public class Ingredient {
    @Id
    @Column(name = "INGR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    @Column(name = "INGR_PRODUCT")
    private String product;
    @ManyToOne
    @JoinColumn(name = "PLT_ID")
    private Plate plate;
}
