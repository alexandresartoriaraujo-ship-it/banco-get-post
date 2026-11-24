package com.seduc1.banco.controllers;


import com.seduc1.banco.entities.Banco;
import com.seduc1.banco.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banco")
public class BancoController {

    @Autowired
    BancoRepository repository;

    @GetMapping
    public List<Banco> findAll() {

        return repository.findAll();
    }
    @PostMapping
    public Banco save(@RequestBody Banco banco) {
        return repository.save(banco);
    }
}
