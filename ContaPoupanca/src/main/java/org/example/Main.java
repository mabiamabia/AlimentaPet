package org.example;

public class Main {
    public static void main(String[] args){

    ContaPoupanca contaPoupanca = new ContaPoupanca(1000); // Cria uma conta poupança com saldo inicial de 1000
        contaPoupanca.aplicarRendimento(); // Aplica o rendimento de 1%

        System.out.println("Saldo atual na conta poupança: "+ contaPoupanca.getSaldo());
    }

}