package com.jwc.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwc.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}