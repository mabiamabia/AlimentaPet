package org.example;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int saldoInicial) {
        super(BigDecimal.valueOf(saldoInicial));
    }


    public void aplicarRendimento() {
        BigDecimal rendimento = getSaldo() * 0.01; // Rendimento de 1%
        BigDecimal saldo = rendimento;
    }

}
