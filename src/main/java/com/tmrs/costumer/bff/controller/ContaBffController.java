package com.tmrs.costumer.bff.controller;

import com.tmrs.costumer.bff.domain.TipoConta;
import com.tmrs.costumer.bff.dto.ContaBffRequest;
import com.tmrs.costumer.bff.dto.ContaResponse;
import com.tmrs.costumer.bff.service.ContaCorrenteService;
import com.tmrs.costumer.bff.service.ContaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.constant.Constable;

@RestController
@RequestMapping("/api/v1/contas")
public class ContaBffController {
    @Autowired
    private ContaCorrenteService contaCorrenteService;
    @Autowired
    private ContaJuridicaService contaJuridicaService;
    @PostMapping
    public ResponseEntity<ContaResponse> criarConta(@RequestBody ContaBffRequest request) {

        if (request.tipo() == null || request.tipo().tipo() == null) {
            return ResponseEntity.badRequest().build();
        }
        TipoConta tipo = request.tipo().tipo();

        ContaResponse response;

        switch (tipo) {
            case CORRENTE -> {
                if (request.corrente() == null) {
                    return ResponseEntity.badRequest().build();
                }
                response = contaCorrenteService.criarContaCorrente(request.corrente());
            }
            case JURIDICA -> {
                if (request.juridica() == null) {
                    return ResponseEntity.badRequest().build();
                }
                response = contaJuridicaService.criarContaJuridica(request.juridica());
            }
            default -> {
                return ResponseEntity.badRequest().build();
            }
        }
        return ResponseEntity.ok(response);
    }
}
