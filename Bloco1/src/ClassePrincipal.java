
import java.util.Scanner;
public abstract class ClassePrincipal {
		
	Scanner ler = new Scanner(System.in);
	
		//Definindo os Abrinutos da Classe Abstrata;
		private String nome;
		private int idade;
		
		//Fazendo Método Contrutor
		public ClassePrincipal (String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}
		
		//Definindo os Métodos abstrados;
		abstract public void peso(double peso);
		abstract public void porte(String porte);
		abstract public void genero(String genero);
		abstract public void MostrarInformacoes();
		abstract public void calcularRacao();
		
		//Metodo para Calcular o peso;
		public void Calcular() {
			
		}
		
		//Metodos Geteres e seters;
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
