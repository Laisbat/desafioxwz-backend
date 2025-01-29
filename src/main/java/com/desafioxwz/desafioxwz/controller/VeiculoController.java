package com.desafioxwz.desafioxwz.controller;

import com.desafioxwz.desafioxwz.veiculo.Veiculo;
import com.desafioxwz.desafioxwz.veiculo.VeiculoRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository repository;

    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return repository.findAll();
    }
}
