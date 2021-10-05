package com.marquinhos.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.marquinhos.model.entity.Lancamento;
import com.marquinhos.model.enums.StatusLancamento;

public interface LancamentoService {

	Lancamento salvar(Lancamento lancamento);

	Lancamento atualizar(Lancamento lancamento);

	void deletar(Lancamento lancamento);

	List<Lancamento> buscar(Lancamento lancamentoFiltro);

	void atualizarStatus(Lancamento lancamento, StatusLancamento status);

	void validar(Lancamento lancamento);

	Optional<Lancamento> obterPorId(Long id);

	BigDecimal obterSaldoPorUsuario(Long id);

}
