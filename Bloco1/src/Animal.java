
public abstract class Animal {
		
	private String nome;
	private int idade;
	private boolean vacinado;
	private String genero;
	private double peso;
	private int porte;
	
		//Definindo os Métodos abstrados;
		abstract public void mostrarGenero(String genero);
		abstract public void MostrarInformacoes();
		abstract public void adicionar(String nome);
		abstract public void deletar(String nome);
		abstract public void Alterar(String nome);
		abstract public void Mostar();
		
		//Metodo para Calcular o peso;
		abstract public void Calcular();
		
		//Método não abstrato
		//public void estaVacinado(boolean vacinado)
		
		//getters e setters
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
		public boolean getVacinado() {
			return vacinado;
		}
		public void setVacinado(boolean vacinado) {
			this.vacinado = vacinado;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public int getPorte() {
			return porte;
		}
		public void setPorte(int porte) {
			this.porte = porte;
		}
		
}
