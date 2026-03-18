package com.tmrs.costumer.bff.dto;

public record ContaCorrenteRequest (
        String numero,
        String titular,
        double saldoInicial,
        double limiteChequeEspecial
){}
