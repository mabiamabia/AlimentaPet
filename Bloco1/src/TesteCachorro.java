import java.util.Scanner;

public class TesteCachorro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op1;
		int op2;
		int op3;
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
			do {
				
			System.out.println("Bem vondos(as) ao Alimenta Pet");
			System.out.println("---------------------------------");
			System.out.println("Menu:\nDigite 1 para cadatrar Cachorro:\nDigite 2 pra Cadastar Gato:\n0 pra sair: ");
			op1= ler.nextInt();
			
		switch(op1) {
			case 1:{
				System.out.println("Digite o nome do cachorro: ");
				String nome = ler.next();
				cachorro.adicionar(nome);
					
				do{
					System.out.println("\nDeseja: \nDigite 1 para Alterar nome: \nDigite 2 para: Mostar o nome:\nDigite 0 para Sair: ");
					op2 = ler.nextInt();
				
					switch(op2) {
					case 1:{
						System.out.println("Digite o nome para Alterar: ");
						String nomeA = ler.next();
						cachorro.Alterar(nomeA);
						break;
					}
					case 2:{
						cachorro.Mostar();
						break;
					}
					case 0:{
						System.out.println("Saiu");
						break;
					}
					default:{
						System.out.println("numero invalido");
						break;
					}
				}
				}while(op2 != 0);
				
				System.out.println("\nDigite o peso do cachorro: ");
				double peso = ler.nextDouble();
				System.out.println("\nDigite o Porte do cachorro: ");
				String porte = ler.next();
				System.out.println("Digite o sexo do cachorro: ");
				String sexo = ler.next();
				System.out.println("Digite a idade do seu cachorro: ");
				int idade = ler.nextInt();
				System.out.println("O seu cachorro eh vacinado ?: ");
				String vacinado = ler.next();
				
				
				cachorro.MostrarInformacoes();
				cachorro.idade(idade);
				cachorro.genero(sexo);
				cachorro.peso(peso);
				cachorro.porte(porte);
				cachorro.Vacinado(vacinado);
				break;
				
				}
				case 2:{
					System.out.println("Digite o nome do gato: ");
					String nome = ler.next();
					gato.adicionar(nome);
					
					do {
						System.out.println("\nDeseja: \nDigite 1 para Alterar nome: \nDigite 2 para: Mostar o nome:\nDigite 0 para Sair: ");
						op3 = ler.nextInt();
					
						switch(op3) {
						case 1:{
							System.out.println("Digite o nome para Alterar: ");
							String nomeA = ler.next();
							gato.Alterar(nomeA);
							break;
						}
						case 2:{
							gato.Mostar();
							break;
						}
						case 0:{
							System.out.println("Saiu");
							break;
						}
						default:{
							System.out.println("numero invalido");
							break;
						}
					}
					}while(op3 != 0);
					
					System.out.println("Digite a idade do gato: ");
					int idade = ler.nextInt();
					System.out.println("Digite a cor do gato: ");
					String cor = ler.next();
					System.out.println("Digite o peso do gato: ");
					double peso = ler.nextDouble();
					System.out.println("Digite o porte do gato: ");
					String porte = ler.next();
					
					gato.Mostar();
					gato.idade(idade);
					gato.cor(cor);
					gato.peso(peso);
					gato.porte(porte);
				}
				
				case 3:{
					System.out.println("numero invalido");
					break;
				}
			}
		}while(op1 != 0);
	}
}
