package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ARK_ITEM_SALE")
@NamedQuery(name = "ItemSale.findByPK", query = "Select i from ItemSale i where i.id = ?1")
public class ItemSale {
    @Id
    @Column(name = "ITSL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    @Column(name = "ITSL_COUNT")
    private Integer count;
    @Column(name = "ITSL_OBS")
    private String observation;
    @ManyToOne
    @JoinColumn(name = "PLT_ID")
    private Plate name;
    @ManyToOne
    @JoinColumn(name = "TKCT_ID")
    private Ticket ticket;
}
