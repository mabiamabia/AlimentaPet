
public class Gato extends ClassePrincipal{
	private String racao;
		
		public Gato (String nome, int idade, double peso, String porte, String genero, String racao) {
			super(nome, idade, peso, porte, genero);
			this.racao = racao; 
		}
	
		public String getRacao() {
			return racao;
		}
	
		public void setRacao(String racao) {
			this.racao = racao;
		}
		
		//criar método calcular quantidade de ração
}
