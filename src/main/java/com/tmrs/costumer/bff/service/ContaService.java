package com.tmrs.costumer.bff.service;

import com.tmrs.costumer.bff.dto.ContaCorrenteRequest;
import com.tmrs.costumer.bff.dto.ContaJuridicaRequest;
import com.tmrs.costumer.bff.dto.ContaResponse;

public int ContaService {
    ContaResponse criarContaCorrente(ContaCorrenteRequest request);
    ContaResponse criarContaJuridica(ContaJuridicaRequest request);
}
