
import java.util.ArrayList;
import java.util.Scanner;

public class Gato extends Animal {
	Scanner ler = new Scanner(System.in);

	public Gato() {};
	
	public Gato(String nome, int idade, boolean vacinado, String genero) {
		setNome(nome);
		setIdade(idade);
		setVacinado(vacinado);
		setGenero(genero);
	}

	ArrayList<String> nomes = new ArrayList<String>();

	@Override
	public void adicionar(String nome) {
		nomes.add(nome);
	}

	@Override
	public void deletar(String nome) {
		if (nomes.contains(nome)) {
			nomes.remove(nome);
		} else {
			System.out.println("\n\tNome inválido!");
		}
	}

	@Override
	public void Alterar(String nome) {
		if (nomes.contains(nome)) {
			System.out.print("Digite o novo nome: ");
			String nome2 = ler.next();
			nomes.remove(nome);
			nomes.add(nome2);
		} else {
			System.out.println("\n\tNome não encontrado!");
		}
	}

	@Override
	public void Mostrar() {
		System.out.println(nomes);
	}

	@Override
	public void Calcular() {

		System.out.println("\nQual é o porte do gato?\n1)Pequeno \n2)Grande");
		System.out.print("\n\t> ");
		int porte = ler.nextInt();
		switch (porte) {
		case 1:
			System.out.println("\n\tPorte Pequeno");
			System.out.println("\tGatos entre 3 a 4kg > Consumir de 40g a 55g");
			System.out.println("\nATENÇÃO: Se o seu pet está fora destas faixas de peso, consulte um veterinário");
			break;
		case 2:
			System.out.println("\n\tPorte Grande");
			System.out.println("\tGatos entre 5 a 6kg > Consumir de 55g a 75g");
			System.out.println("\nATENÇÃO: Se o seu pet está fora destas faixas de peso, consulte um veterinário");
			
			break;
		default:
			System.out.println("\n\tOpção inválida.");
		}
	}

	@Override
	public void mostrarGenero(String genero) {
		System.out.println ("O genero do gato: " + genero);
	}

	@Override
	public void MostrarInformacoes() {
		System.out.println("O nome do gato: " + nomes);
	}

	public void idade(int idade) {
		System.out.println("A idade do gato é: " + idade);
	}

	public void Vacinado(String vacinado) {
		System.out.println("O seu gato é vacinado: " + vacinado);
	}

}
