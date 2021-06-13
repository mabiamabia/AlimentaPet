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
			System.out.println("Nome inválido!");
		}
	}

	@Override
	public void Alterar(String nome) {
		if (nomes.contains(nome)) {
			System.out.println("Digite o novo nome: ");
			String nome2 = ler.next();
			nomes.remove(nome);
			nomes.add(nome2);
		} else {
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
		int porte = ler.nextInt();
		switch (porte) {
		case 1:
			System.out.println("Porte Pequeno");
			System.out.println("gatos entre 3 a 4kg / Consumir de 40g a 55g");
			break;
		case 2:
			System.out.println("gatos entre 5 a 6kg / Consumir de 55g a 75g");
			break;
		default:
			System.out.println("Opção inválida");
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
		System.out.println("A idade do gato eh: " + idade);
	}

	public void Vacinado(String vacinado) {
		System.out.println("O seu gato é vacinado: " + vacinado);
	}

}
