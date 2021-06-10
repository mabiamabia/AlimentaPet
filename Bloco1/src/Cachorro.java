import java.util.Scanner;

public class Cachorro extends ClassePrincipal{
	Scanner ler = new Scanner(System.in);
	int x;
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		System.out.println("Qual o nome do seu pet? " + nome + "\nQual a idade do seu pet? " + idade);
		x = ler.nextInt();
	}
	
	@Override
	public void peso(double peso) {
		//pedir peso
	}
	
	@Override
	public void porte(String porte) {
		//pedir porte
	}
	
	@Override
	public void genero(String genero) {
		//pedir genero
	}

}
