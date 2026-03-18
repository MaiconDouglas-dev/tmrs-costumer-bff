package com.tmrs.costumer.bff.domain;

public abstract class Conta {

    protected String numero;
    protected String titular;
    protected double saldoInicial;

    protected Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public abstract TipoConta getTipo();

    public double calcularTarifaAbertura(){
        return 0.0;
    }
}
