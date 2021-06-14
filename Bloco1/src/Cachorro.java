import java.util.ArrayList;
import java.util.Scanner;

public class Cachorro extends Animal{
	Scanner ler = new Scanner(System.in);

	double peso;
	int porte;
	
	private String nome;
	private int idade;
	private boolean vacinado;
	
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
			System.out.println("\n\tNome inválido!");
		}
	}
	
	@Override
	public void Alterar(String nome) {
		if(nomes.contains(nome)) {
			System.out.print("\nDigite o novo nome: ");
			String nome2 = ler.next();
			nomes.remove(nome);
			nomes.add(nome2);
		}else{
			System.out.println("\n\tNome não encontrado!");
		}
	}
	
	@Override
	public void Mostrar() {	
		System.out.println(nomes);
	}
	@Override
	public void Calcular() {
		
		System.out.println("\nQual é o porte do cachorro?\n 1)Pequeno\n 2)Médio\n 3)Grande");
		System.out.print("\n\t> ");
		porte = ler.nextInt();
		switch(porte) {
		case 1: 
			System.out.println("\n\tPorte Pequeno");
			System.out.println("\tCachorros entre 5 a 10kg > Consumir de 110g a 180g");
			System.out.println("\nATENÇÃO: Se o seu pet está fora destas faixas de peso, consulte um veterinário");
			break;
		case 2: 
			System.out.println("\n\tPorte Médio");
				System.out.println("\tPeso de	11 a 15 kg > Consumir 180g – 250g\r\n\t"
						+ "Peso de	15 a 20 kg > Consumir 250 a 310\r\n\t"
						+ "Peso de 20 a 24 kg > Consumir 310g a 360g\r\n"
						+ "");
				System.out.println("\nATENÇÃO: Se o seu pet está fora destas faixas de peso, consulte um veterinário");
			break;
		case 3:
			System.out.println("\n\tPorte Grande");
			System.out.println("\tCachorros entre 25 a 40kg > Consumir de 360g a 520g");
			System.out.println("\nATENÇÃO: Se o seu pet está fora destas faixas de peso, consulte um veterinário");
		break;
		default: System.out.println("\n\tOpção inválida");
		}	
	}
	
	@Override
	public void mostrarGenero(String genero) {
		System.out.println("O genero do cachorro: " + genero);
	}
	
	@Override
	public void MostrarInformacoes() {
		System.out.println("O nome do cachorro: " + nomes);
	}
	
	public void idade(int idade) {
		System.out.println("A idade do cachorro é: " + idade);
	}
	
	public void Vacinado (String vacinado) {
		System.out.println("O seu cachorro é vacinado: " + vacinado);
	}
	
	public boolean getVacinado() {
		
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
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
