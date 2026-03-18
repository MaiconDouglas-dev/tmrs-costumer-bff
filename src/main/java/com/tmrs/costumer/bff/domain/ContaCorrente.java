package com.tmrs.costumer.bff.domain;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numero, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    @Override
    public TipoConta getTipo(){
        return TipoConta.CORRENTE;
    }
    @Override
    public double calcularTarifaAbertura(){
        return 10.0;
    }
}
