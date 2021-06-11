import java.util.Scanner;

public class TesteCachorro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
<<<<<<< HEAD
		//Implementar escolha de cachorro ou gato usando metodo 
=======
<<<<<<< HEAD
<<<<<<< HEAD
		//Implementar escolha de cachorro ou gato usando metodo
		ClassePrincipal principal = new ClassePrincipal();
		principal.especieAnimal();
=======
=======
>>>>>>> 451dea2a8ace28f6b8361889dd0645b8b38a70e4
		//Implementar escolha de cachorro ou gato usando metodo ALGUMA COISA
		//
>>>>>>> 451dea2a8ace28f6b8361889dd0645b8b38a70e4
>>>>>>> c7ce5d7938cf7fe878fc71ae465e33b50eb07493
		
		String nome;
		System.out.println("Digite o nome: ");
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
