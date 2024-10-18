package com.jwc.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwc.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}