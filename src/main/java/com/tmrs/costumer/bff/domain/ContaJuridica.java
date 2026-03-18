package com.tmrs.costumer.bff.domain;

public class ContaJuridica extends Conta {

    private String cnpj;
    private double taxaManutencao;

    public ContaJuridica(String numero, String titular, String cnpj, double saldoInicial, double taxaManutencao) {
        super(numero, titular, saldoInicial);
        this.cnpj = cnpj;
        this.taxaManutencao = taxaManutencao;
    }
    public String getCnpj() {
        return cnpj;
    }
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    @Override
    public TipoConta getTipo(){
        return TipoConta.JURIDICA;
    }
    @Override
    public double calcularTarifaAbertura(){
        return 25.0;
    }
}
