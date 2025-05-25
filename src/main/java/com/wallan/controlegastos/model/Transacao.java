package com.wallan.controlegastos.service;

import com.wallan.controlegastos.model.Transacao;
import com.wallan.controlegastos.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    public List<Transacao> listarTodas() {
        return repository.findAll();
    }

    public Transacao salvar(Transacao transacao) {
        return repository.save(transacao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
