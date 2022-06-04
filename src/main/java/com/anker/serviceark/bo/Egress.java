package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "ARK_EGRESS")
@NamedQuery(name = "Egress.findByPK", query = "Select e from Egress e where e.id = ?1")
public class Egress {
    @Id
    @Column(name = "EGS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    @Column(name = "EGS_DATE")
    private OffsetDateTime date;
    @Column(name = "EGS_AMOUNT")
    private Float amount;
}
