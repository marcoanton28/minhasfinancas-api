package com.marquinhos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marquinhos.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
