package com.jwc.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwc.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
