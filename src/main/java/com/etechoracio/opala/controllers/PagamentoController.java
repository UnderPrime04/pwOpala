package com.etechoracio.opala.controllers;

import com.etechoracio.opala.entity.Banda;
import com.etechoracio.opala.entity.Pagamento;
import com.etechoracio.opala.repositories.PagamentoRepository;
import com.etechoracio.opala.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pRepository;

    @GetMapping
    public List<Pagamento> buscarTodos(){ return pRepository.findAll();}


}
