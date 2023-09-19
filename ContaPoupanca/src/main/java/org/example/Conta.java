package org.example;

import java.math.BigDecimal;

public abstract class Conta {
    private Pessoa titular;
public Conta(BigDecimal saldoInicial){
    this.saldo = saldoInicial;
}
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public int getSenhaInt() {
        return senhaInt;
    }

    public void setSenhaInt(int senhaInt) {
        this.senhaInt = senhaInt;
    }

    private int agencia;
    private int numeroConta;
    private BigDecimal saldo;
    private String senha;
    private int tipoConta;
    private String chavePix;
    private int senhaInt;

}
