package com.tmrs.costumer.bff.dto;

import com.tmrs.costumer.bff.domain.TipoConta;

public record ContaResponse (
        String numero,
        String titular,
        TipoConta tipo,
        double saldoInicial,
        double tarifaAbertura
){}
