
public abstract class ClassePrincipal {
		//Definindo atributos
		private String nome;
		private int idade;
		abstract public void peso(double peso);
		abstract public void porte(String porte);
		abstract public void genero(String genero);
		
		//Método Contrutor
		
		public ClassePrincipal (String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
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

}
