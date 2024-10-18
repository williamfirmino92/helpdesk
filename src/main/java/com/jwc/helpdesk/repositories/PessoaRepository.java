package com.jwc.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwc.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
