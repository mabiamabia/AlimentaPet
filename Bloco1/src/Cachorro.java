import java.util.Scanner;

public class Cachorro extends ClassePrincipal{
	Scanner ler = new Scanner(System.in);
	
	private String vacinado;
	
	public Cachorro(String nome, int idade, String vacinado) {
		super(nome, idade);
		this.vacinado = vacinado;
	}
	
	@Override
	public void peso(double peso) {
		System.out.println("O peso do Cachorro eh: " + peso);
	}
	
	@Override
	public void porte(String porte) {
		System.out.println("O porto do Cachorro eh: " + porte);
	}
	
	@Override
	public void genero(String genero) {
		System.out.println("O genero do Cachorro eh: " + genero);
	}
	
	@Override
	public void MostrarInformacoes() {
		System.out.println("O nome do Cachorro eh: " + getNome());
		System.out.println("A idade do Cachorro eh: " + getIdade());
		System.out.println("O seu cahorro eh vacinado ?" + vacinado);
	}
	
	public String getVacinado() {
		return vacinado;
	}

	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}
	
	//criar método calcular quantidade de ração
	@Override
	public void calcularRacao() {
		//calcular
	}
}
