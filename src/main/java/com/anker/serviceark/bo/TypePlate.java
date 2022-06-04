package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ARK_TYPE_PLATE")
@NamedQuery(name = "TypePlate.findByPK", query = "Select t from TypePlate t where t.id = ?1")
public class TypePlate {
    @Id
    @Column(name = "TPLT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Long version;
    @Column(name = "TPLT_TYPE")
    private String name;
//    @OneToMany(mappedBy = "type")
//    private List<Plate> plates;
}
