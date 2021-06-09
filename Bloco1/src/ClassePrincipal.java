
public class ClassePrincipal {
		//Definindo atributos
		private String nome;
		private int idade;
		private double peso;
		private String porte;
		private String genero;
		
		//Método Contrutor
		
		public ClassePrincipal (String nome, int idade, double peso, String porte, String genero) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.peso = peso; 
			this.porte = porte;
			this.genero = genero;
		}
		
		//Métodos get e set
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
			System.out.println("a");
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
			System.out.println("Hanaaa");
			System.out.println("Hanaaaaaa");
		}

		public String getPorte() {
			return porte;
		}

		public void setPorte(String porte) {
			this.porte = porte;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		
	

}
