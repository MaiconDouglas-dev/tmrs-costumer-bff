package com.tmrs.costumer.bff.dto;

public record ContaBffRequest (
        TipoContaRequest tipo,
        ContaCorrenteRequest corrente,
        ContaJuridicaRequest juridica
){}
