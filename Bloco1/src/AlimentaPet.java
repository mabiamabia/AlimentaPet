
import java.util.Scanner;

public class AlimentaPet {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op1;
		int op2;
		int op3;
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		System.out.println("Bem vindos(as) ao Alimenta Pet");
		System.out.println("---------------------------------");
		
			do {
				System.out.println("Menu:\nDigite 1 para cadastrar cachorro \nDigite 2 pra cadastar gato \n0 Para sair ");
				
				try {
					op1= ler.nextInt();
				} catch (Exception e) {
					op1 = -1;
				}
				
				switch(op1) {
					case 1:
						ler.nextLine();
						System.out.println("Digite o nome do cachorro: ");
						String nome = ler.next();
						cachorro.adicionar(nome);
							
						do{
							System.out.println("\nDeseja: \nDigite 1 para alterar nome: \nDigite 2 para mostar o nome:\nDigite 0 para continuar: ");
							try {
								op2= ler.nextInt();
							} catch (Exception e) {
								op2 = -1;
							}
						
							switch(op2) {
							case 1:
								ler.nextLine();
								System.out.println("Digite o nome para Alterar: ");
								String nomeA = ler.next();
								cachorro.Alterar(nomeA);
								break;
							case 2:
								ler.nextLine();
								cachorro.Mostar();
								break;
							case 0:
								ler.nextLine();
								break;
		
							default:
								ler.nextLine();
								System.out.println("\n\tOpção inválida!\n");
								break;
							}
						}
						while(op2 != 0);
						
					
					
					//String porte = ler.next();
					System.out.print("\nDigite o gênero do cachorro (1 para fêmea ou 2 para macho): ");
					
					int opGenero = 0;
					String genero = "";
					
					
					try {
							opGenero = ler.nextInt();						
						} catch (Exception e) {
							System.out.print("\n\tOpção inválida. Digite novamente.");	
						}
					if (opGenero == 1) {
						genero = "Fêmea";
						//System.out.print("\n\tFemea ok.");
					} else if (opGenero == 2) {
						genero = "Macho";
						//System.out.print("\n\tMacho ok.");
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
				
				case 2:
						ler.nextLine();
						System.out.println("Digite o nome do gato: ");
						String nome1 = ler.next();
						gato.adicionar(nome1);
						
						do {
							System.out.println("\nDeseja: \nDigite 1 para alterar nome: \nDigite 2 para mostar o nome:\nDigite 0 para continuar: ");
							op3 = ler.nextInt();
						
							switch(op3) {
							case 1:
								ler.nextLine();
								System.out.println("Digite o nome para alterar: ");
								String nomeA = ler.next();
								gato.Alterar(nomeA);
								break;
							
							case 2:
								ler.nextLine();
								gato.Mostar();
								break;
							
							case 0:
								ler.nextLine();
								break;
							
							default:
								System.out.println("\n\tOpção inválida.\n");
								break;
							}
						}
						while(op3 != 0);
						
						System.out.println("Digite a idade do gato: ");
						int idade1 = ler.nextInt();
						System.out.println("Digite o peso do gato: ");
						double peso = ler.nextDouble();
						//System.out.println("Digite o porte do gato: ");
						
						
						gato.Mostar();
						gato.idade(idade1);
						gato.Calcular();
						
	//					gato.cor(cor);
	//					gato.peso(peso);
	//					gato.porte(porte);
						break;
					
				case 0:
					ler.nextLine();
					System.out.println("\n\tVocê saiu.\n");
					break;

				default:
					ler.nextLine();
					System.out.println("\n\tOpção inválida!\n");
					break;
					
				
				}
		}
		while(op1 != 0);

	
	}
}
