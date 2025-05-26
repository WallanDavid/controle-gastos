package com.wallan.controlegastos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallan.controlegastos.dto.TransacaoRequestDTO;
import com.wallan.controlegastos.dto.TransacaoResponseDTO;
import com.wallan.controlegastos.mapper.TransacaoMapper;
import com.wallan.controlegastos.model.Transacao;
import com.wallan.controlegastos.repository.TransacaoRepository;


@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    public List<TransacaoResponseDTO> listarTodas() {
        return repository.findAll()
                .stream()
                .map(TransacaoMapper::toDTO) // método estático direto
                .collect(Collectors.toList());
    }

    public TransacaoResponseDTO salvar(TransacaoRequestDTO dto) {
        Transacao transacao = TransacaoMapper.toEntity(dto);
        return TransacaoMapper.toDTO(repository.save(transacao));
    }

    public TransacaoResponseDTO buscarPorId(Long id) {
        Optional<Transacao> transacao = repository.findById(id);
        return transacao.map(TransacaoMapper::toDTO)
                        .orElseThrow(() -> new RuntimeException("Transação não encontrada"));
    }

    public TransacaoResponseDTO atualizar(Long id, TransacaoRequestDTO dto) {
        Transacao existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transação não encontrada"));

        existente.setDescricao(dto.getDescricao());
        existente.setValor(dto.getValor());
        existente.setTipo(dto.getTipo());
        existente.setData(dto.getData());

        return TransacaoMapper.toDTO(repository.save(existente));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
