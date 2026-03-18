package com.tmrs.costumer.bff.service;

import com.tmrs.costumer.bff.domain.ContaJuridica;
import com.tmrs.costumer.bff.domain.TipoConta;
import com.tmrs.costumer.bff.dto.ContaCorrenteRequest;
import com.tmrs.costumer.bff.dto.ContaJuridicaRequest;
import com.tmrs.costumer.bff.dto.ContaResponse;
import org.springframework.stereotype.Service;

@Service
public class ContaJuridicaService implements ContaService {

    @Override
    public ContaResponse criarContaCorrete(ContaCorrenteRequest request) {
        throw new UnsupportedOperationException("Use ContaCorrenteService para contas correntes");
    }
    @Override
    public ContaResponse criarContaJuridica(ContaJuridicaRequest request) {
        ContaJuridica conta = new ContaJuridica(
                request.numero(),
                request.titular(),
                request.cnpj(),
                request.saldoInicial(),
                request.taxaManutencao()
        );
        double tarifa = conta.calcularTarifaAbertura();
        return new ContaResponse(
                conta.getNumero(),
                conta.getTitular(),
                TipoConta.JURIDICA,
                conta.getSaldoInicial(),
                tarifa
        );
    }
}
