package com.tmrs.costumer.bff.service;

import com.tmrs.costumer.bff.domain.ContaCorrente;
import com.tmrs.costumer.bff.domain.TipoConta;
import com.tmrs.costumer.bff.dto.ContaCorrenteRequest;
import com.tmrs.costumer.bff.dto.ContaJuridicaRequest;
import com.tmrs.costumer.bff.dto.ContaResponse;
import org.springframework.stereotype.Service;

@Service
public class ContaCorrenteService implements ContaService{

    @Override
    public ContaResponse criarContaCorrente(ContaCorrenteRequest request) {
        ContaCorrente conta = new ContaCorrente(
                request.numero(),
                request.titular(),
                request.saldoInicial(),
                request.limiteChequeEspecial()
        );

        double tarifa = conta.calcularTarifaAbertura();
        return new ContaResponse(
                conta.getNumero(),
                conta.getTitular(),
                TipoConta.CORRENTE,
                conta.getSaldoInicial(),
                tarifa
        );
    }
    @Override
    public ContaResponse criarContaJuridica(ContaJuridicaRequest request) {
        throw new UnsupportedOperationException("Use ContaJuridicaService para contas Jurídicas.");
    }
}
