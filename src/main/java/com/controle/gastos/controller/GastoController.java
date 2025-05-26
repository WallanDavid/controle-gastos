package com.controle.gastos.controller;

import com.controle.gastos.Gasto;
import com.controle.gastos.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gastos") // <- ESSA LINHA É O CAMINHO RAIZ DOS ENDPOINTS
public class GastoController {
    @Autowired
    private GastoRepository repository;

    @GetMapping
    public List<Gasto> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Gasto buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Gasto criar(@RequestBody Gasto gasto) {
        return repository.save(gasto);
    }

    @PutMapping("/{id}")
    public Gasto atualizar(@PathVariable Long id, @RequestBody Gasto gasto) {
        if (!repository.existsById(id)) return null;
        gasto.setId(id);
        return repository.save(gasto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
