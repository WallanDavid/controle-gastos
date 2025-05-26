package com.wallan.controlegastos.mapper;

import com.wallan.controlegastos.dto.TransacaoRequestDTO;
import com.wallan.controlegastos.dto.TransacaoResponseDTO;
import com.wallan.controlegastos.model.Transacao;

public class TransacaoMapper {

    public static Transacao toEntity(TransacaoRequestDTO dto) {
        Transacao transacao = new Transacao();
        transacao.setDescricao(dto.getDescricao());
        transacao.setValor(dto.getValor());
        transacao.setTipo(dto.getTipo());
        transacao.setData(dto.getData());
        return transacao;
    }

    public static TransacaoResponseDTO toDTO(Transacao transacao) {
        TransacaoResponseDTO dto = new TransacaoResponseDTO();
        dto.setId(transacao.getId());
        dto.setDescricao(transacao.getDescricao());
        dto.setValor(transacao.getValor());
        dto.setTipo(transacao.getTipo());
        dto.setData(transacao.getData());
        return dto;
    }
}
