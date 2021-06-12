import java.util.ArrayList;
import java.util.Scanner;

public class Cachorro extends ClassePrincipal{
	Scanner ler = new Scanner(System.in);
	
	
	private String nome;
	private int idade;
	private String vacinado;
	
	public Cachorro() {
		this.nome = getNome();
		this.idade = getIdade();
		this.vacinado = getVacinado();
	}
	
	ArrayList<String> nomes = new ArrayList<String>();
	
	@Override
	public void adicionar(String nome) {
		nomes.add(nome);
	}
	
	
	@Override
	public void deletar(String nome) {	
		if(nomes.contains(nome)) {
			nomes.remove(nome);
		}else{
			System.out.println("nome invalido!");
		}
	}
	
	@Override
	public void Alterar(String nome) {
		if(nomes.contains(nome)) {
			System.out.println("Digite o novo nome: ");
			String nome2 = ler.next();
			nomes.remove(nome);
			nomes.add(nome2);
		}else{
			System.out.println("nome não encontrado!");
		}
	}
	
	@Override
	public void Mostar() {	
		System.out.println(nomes);
	}
	
	@Override
	public void peso(double peso) {
		System.out.println("O peso do Cachorro eh: " + peso);
	}
	
	@Override
	public void porte(String porte) {
		System.out.println("O porte do Cachorro eh: " + porte);
	}
	
	@Override
	public void genero(String genero) {
		System.out.println("O genero do Cachorro eh: " + genero);
	}
	
	@Override
	public void MostrarInformacoes() {
		System.out.println("O nome do Cachorro eh: " + nomes);
	}
	
	public void idade(int idade) {
		System.out.println("A idade do cachorro eh: " + idade);
	}
	
	public void Vacinado (String vacinado) {
		System.out.println("O seu cachorro eh Vacinado: " + vacinado);
	}
	
	public String getVacinado() {
		return vacinado;
	}

	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//criar método calcular quantidade de ração
	@Override
	public void calcularRacao() {
		//calcular
	}
}
