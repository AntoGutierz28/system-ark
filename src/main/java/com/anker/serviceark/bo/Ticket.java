package com.anker.serviceark.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "ARK_TICKET")
@NamedQuery(name = "Ticket.findByPK", query = "Select t from Ticket t where t.id = ?1")
public class Ticket {
    @Id
    @Column(name = "TKCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    @Column(name = "TCKT_DATE")
    private OffsetDateTime date;
    @Column(name = "TCKT_AMOUNT")
    private Float amount;
    @Column(name = "TCKT_CLIENT")
    private String client;
    @Column(name = "TCKT_STATE")
    private String state;
}
