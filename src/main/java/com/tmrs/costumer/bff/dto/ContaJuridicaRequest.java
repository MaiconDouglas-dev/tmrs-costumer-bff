package com.tmrs.costumer.bff.dto;

public record ContaJuridicaRequest (
        String numero,
        String titular,
        String cnpj,
        double saldoInicial,
        double taxaManutencao
){}
