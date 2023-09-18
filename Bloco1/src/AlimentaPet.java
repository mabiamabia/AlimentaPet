
import java.util.Scanner;

public class AlimentaPet {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int op1;
		int op2;
		int op3;

		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		System.out.print("Bem vindos(as) ao Alimenta Pet");

		do {
			System.out.println("\n---------------------------------");
			System.out.println(
					"\nMENU PRINCIPAL \nDigite a opção desejada:\n1 - Cadastrar cachorro \n2 - Cadastar gato \n0 - SAIR");

			try {
				System.out.print("\n\t> ");
				op1 = ler.nextInt();
			} catch (Exception e) {
				op1 = -1;
			}

			switch (op1) {
			case 1:
				ler.nextLine();
				System.out.println("---------------------------------");
				System.out.println("\nCADASTRAR CACHORRO ");
				System.out.print("\nDigite o nome do cachorro: ");
				String nome = ler.next();
				cachorro.adicionar(nome);

				do {
					System.out.println(
							"\nO que deseja fazer? \n1) Alterar nome \n2) Mostar o nome \n>> Digite 0 para continuar o cadastro");
					try {
						System.out.print("\n\t> ");
						op2 = ler.nextInt();
					} catch (Exception e) {
						op2 = -1;
					}

					switch (op2) {
					case 1:
						ler.nextLine();
						System.out.print("\nQual nome deseja alterar? ");
						String nomeA = ler.next();
						cachorro.Alterar(nomeA);
						break;
					case 2:
						ler.nextLine();
						cachorro.Mostrar();
						break;
					case 0:
						ler.nextLine();
						break;

					default:
						ler.nextLine();
						System.out.print("\tOpção inválida!\n");
						break;
					}
				} while (op2 != 0);

				// String porte = ler.next();
				System.out.println("\nDigite o gênero do cachorro \n1) Fêmea \n2) Macho ");

				int opGenero = 0;
				String genero = "";

				try {
					System.out.print("\n\t> ");
					opGenero = ler.nextInt();
				} catch (Exception e) {
					System.out.print("\tOpção inválida. Digite novamente.");
				}
				if (opGenero == 1) {
					genero = "Fêmea";
					// System.out.print("\n\tFemea ok.");
				} else if (opGenero == 2) {
					genero = "Macho";
					// System.out.print("\n\tMacho ok.");
				} else {
					System.out.print("\n\tOpção inválida.");
				}

				System.out.print("\nDigite a idade do seu cachorro: ");
				int idade = ler.nextInt();
				System.out.print("\nO seu cachorro é vacinado? ");
				String vacinado = ler.next();

				cachorro.MostrarInformacoes();
				cachorro.idade(idade);
				cachorro.mostrarGenero(genero);
				cachorro.Vacinado(vacinado);
				cachorro.Calcular();
				break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			case 2:
				ler.nextLine();
				System.out.println("---------------------------------");
				System.out.println("\nCADASTRAR GATO");
				System.out.print("\nDigite o nome do gato: ");
				String nome1 = ler.next();
				gato.adicionar(nome1);

				do {
					System.out.println(
							"\nO que deseja fazer? \n1) Alterar nome \n2) Mostar o nome \n>> Digite 0 para continuar o cadastro");
					System.out.print("\n\t> ");
					op3 = ler.nextInt();

					switch (op3) {
					case 1:
						ler.nextLine();
						System.out.print("Digite o nome para alterar: ");
						String nomeA = ler.next();
						gato.Alterar(nomeA);
						break;

					case 2:
						ler.nextLine();
						gato.Mostrar();
						break;

					case 0:
						ler.nextLine();
						break;

					default:
						System.out.println("\n\tOpção inválida.\n");
						break;
					}
				} while (op3 != 0);

				System.out.print("\nDigite a idade do gato: ");
				int idade1 = ler.nextInt();
				System.out.print("\nDigite o peso do gato: ");
				double peso = ler.nextDouble();
				// System.out.println("Digite o porte do gato: ");

				System.out.println("_________________");

				gato.Mostrar();
				gato.idade(idade1);
				gato.Calcular();

				// gato.cor(cor);
				// gato.peso(peso);
				// gato.porte(porte);
				break;

			case 0:
				ler.nextLine();
				System.out.println("\n\t---------------------------------");
				System.out.println("\n\tAgradecemos por usar o AlimentaPet. \n\tVolte sempre!");
				break;

			default:
				ler.nextLine();
				System.out.println("\n\tOpção inválida!\n");
				break;

			}
		} while (op1 != 0);

	}
}
