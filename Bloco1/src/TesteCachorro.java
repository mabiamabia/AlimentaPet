import java.util.Scanner;

public class TesteCachorro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Implementar escolha de cachorro ou gato usando metodo ALGUMA COISA
		//
		
		String nome;
		System.out.println("Digite o nome: HANNA");
		nome = ler.next();
		
		Cachorro gui = new Cachorro(nome, 7, 18, "médio", "macho", "sim");
		gui.mostrarInfo();
		
		System.out.println();
		System.out.println("Trocando o nome: ");
		gui.setNome("Aoooo");
		System.out.println("testou");
		System.out.println("testou");
		System.out.println("testou");
		gui.mostrarInfo();
	}
}
