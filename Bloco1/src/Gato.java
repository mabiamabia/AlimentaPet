import java.util.ArrayList;
import java.util.Scanner;

public class Gato extends Animal{
	Scanner ler = new Scanner(System.in);
	double peso;
	int porte;
	
	private String nome;
	private int idade;
	private String vacinado;
	
	public Gato() {
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
			System.out.println("Nome inválido!");
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
			System.out.println("Nome não encontrado!");
		}
	}
	
	@Override
	public void Mostar() {	
		System.out.println(nomes);
	}
	@Override
	public void Calcular() {
		
		System.out.println("\tEscolha uma opção:\n 1-Pequeno\n 2-Grande");
		porte = ler.nextInt();
		switch(porte) {
		case 1: 
			System.out.println("Porte Pequeno");
			System.out.println("gatos entre 3 a 4kg / Consumir de 40g a 55g");
			break;
		case 2:			
			System.out.println("gatos entre 5 a 6kg / Consumir de 55g a 75g");
		break;
		default: System.out.println("Opção inválida");
		}	
	}
	
	@Override
	public void genero(String genero) {
		System.out.println("O genero do gato: " + genero);
	}
	
	@Override
	public void MostrarInformacoes() {
		System.out.println("O nome do gato: " + nomes);
	}
	
	public void idade(int idade) {
		System.out.println("A idade do gato eh: " + idade);
	}
	
	public void Vacinado (String vacinado) {
		System.out.println("O seu gato é vacinado: " + vacinado);
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

}
