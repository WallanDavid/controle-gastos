package com.wallan.controlegastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallan.controlegastos.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
