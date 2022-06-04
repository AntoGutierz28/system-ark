package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ARK_PLATE")
@NamedQuery(name = "Plate.findByPK", query = "Select p from Plate p where p.id = ?1")
public class Plate {
    @Id
    @Column(name = "PLT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Long version;
    @Column(name = "PLT_NAME")
    private String name;
    @Column(name = "PLT_PRICE")
    private Float price;
    @Column(name = "PLT_STOCK")
    private Integer stock;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "TPLT_ID")
    private TypePlate type;
    @OneToMany(mappedBy = "plate")
    private List<Ingredient> ingredient;
}
