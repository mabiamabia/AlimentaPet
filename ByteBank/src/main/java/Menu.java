import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        List<Conta> contas = new ArrayList<>();
        int opcao;
        boolean sair = false;

        while (!sair) {

            System.out.println("\nBEM VINDO! SELECIONE UMA DAS OPÇÕES ABAIXO: ");
            System.out.println("1 - CADASTRAR CONTA");
            System.out.println("2 - ACESSAR CONTA");
            System.out.println("3 - SAIR");
            opcao = Integer.parseInt(br.readLine());

            switch (opcao) {
                case 1:
                    System.out.println("QUAL TIPO DE CONTA DESEJA CADASTRAR: ");
                    System.out.println("1 - CONTA CORRENTE");
                    System.out.println("2 - CONTA POUPANÇA");
                    int tipoConta = Integer.parseInt(br.readLine());

                    System.out.println("INFORME O NOME DO TITULAR DA CONTA:   ");
                    String nome = br.readLine();
                    System.out.println("INFORME O CPF DO TITULAR DA CONTA (SEM . E -):   ");
                    String cpf = br.readLine();
                    System.out.println("INFORME O ENDEREÇO DO TITULAR DA CONTA:   ");
                    String endereco = br.readLine();
                    System.out.println("INFORME O TELEFONE DO TITULAR DA CONTA:   ");
                    String telefone = br.readLine();
                    Pessoa pessoa = new Pessoa(nome, cpf, endereco, telefone);

                    int agencia = random.nextInt(9000) + 1000;
                    int numeroConta = random.nextInt(9000) + 1000;

                    System.out.println("CADASTRE UMA SENHA DE 6 DÍGITOS (APENAS NÚMEROS): ");
                    int senha = Integer.parseInt(br.readLine());

                    if (tipoConta == 1) {
                        System.out.println("CADASTRE UMA CHAVE PIX:  ");
                        String chavePix = br.readLine();
                        ContaCorrente contaCorrente = new ContaCorrente(pessoa, agencia, numeroConta, senha, chavePix);
                        contas.add(contaCorrente);
                    } else {
                        ContaPoupanca contaPoupanca = new ContaPoupanca(pessoa, agencia, numeroConta, senha);
                    }
                    System.out.println("CONTA CADASTRADA COM SUCESSO! TITULAR:  " + nome + ", agência: " + agencia + " conta: " + numeroConta);
                    Thread.sleep(2000);

                case 2:
                    System.out.println("DIGITE SUA AGÊNCIA: ");
                    int buscaAgencia = Integer.parseInt(br.readLine());
                    System.out.println("DIGITE O NÚMERO DA CONTA: ");
                    int buscaConta = Integer.parseInt(br.readLine());
                    System.out.println("DIGITE SUA SENHA: ");
                    int buscaSenha = Integer.parseInt(br.readLine());

                    for (Conta conta : contas) {
                        if (conta.getSenha() == buscaConta && conta.getAgencia() == buscaAgencia && conta.getNumeroConta() == buscaConta) {
                            if (conta instanceof ContaCorrente contaCorrente) {
                                System.out.println("BEM VINDO: " + contaCorrente.getTitular().getNome() + "SEU SALDO É DE : R$ " + contaCorrente);
                            } else if (conta instanceof ContaPoupanca contaPoupanca) {
                                System.out.println("BEM VINDO:  " + contaPoupanca.getTitular().getNome());

                            }
                        }
                    }

                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    Thread.sleep(2000);
            }
        }


    }
}

