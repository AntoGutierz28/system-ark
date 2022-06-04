package com.anker.serviceark.repository;

import com.anker.serviceark.bo.Ticket;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer>, JpaSpecificationExecutor<Ticket> {
}
