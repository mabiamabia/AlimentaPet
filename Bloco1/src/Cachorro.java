import java.util.Scanner;

public class Cachorro extends ClassePrincipal{
private String castrado;
	Scanner ler = new Scanner(System.in);
	
	public Cachorro(String nome, int idade, double peso, String porte, String genero, String castrado) {
		super(nome, idade, peso, porte, genero);
		this.castrado = castrado; 
	}

	public void mostrarInfo() {
		System.out.println("Nome do Cachorro: " + getNome());
		System.out.println("idade: " + getIdade());
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	
	
	public void cadastro(double nome) {
		System.out.println("Digite seu nome: ");
		nome = ler.nextInt();
	}
	//criar método calcular quantidade de ração
}
