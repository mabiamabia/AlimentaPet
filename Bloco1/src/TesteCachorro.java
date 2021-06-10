import java.util.Scanner;

public class TesteCachorro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
<<<<<<< HEAD
		//Implementar escolha de cachorro ou gato usando metodo
		ClassePrincipal principal = new ClassePrincipal();
		principal.especieAnimal();
=======
		//Implementar escolha de cachorro ou gato usando metodo ALGUMA COISA
		//
>>>>>>> 451dea2a8ace28f6b8361889dd0645b8b38a70e4
		
		String nome;
		System.out.println("Digite o nome: HANNA funfouuuuuuuuuuuu caraiiii");
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
