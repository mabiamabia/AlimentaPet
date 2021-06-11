import java.util.Scanner;


public class Gato extends ClassePrincipal{
	Scanner ler = new Scanner(System.in);
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		super(nome,idade);
		this.cor = cor;
	}
		
	@Override
	public void peso(double peso) {
		System.out.println("O peso do gato eh: " + peso);
	}
	
	@Override
	public void porte(String porte) {
		System.out.println("O porte do gato eh: " + porte);
	}
	
	@Override
	public void genero(String genero) {
		System.out.println("O genero do gato eh: " + genero);
	}
	
	@Override
	public void MostrarInformacoes() {
	System.out.println("O nome do gato eh: " + getNome());
	System.out.println("A idade do gato eh: " + getIdade());
	System.out.println("A cor do pelo do gato eh: " + cor);
	}
	
	//criar método calcular quantidade de ração
	@Override
	public void calcularRacao() {
		//calcular
	}
}
		
		
		
		
