package reservaSala;

public class Cargo {
	private String nome;
	private float Salario;
	
	public float getSalario() {
		return this.Salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome == null||nome.trim().isEmpty()) {
			System.out.println("nome nao pode ser vazio");
		}else {
			this.nome = nome;
		}	
	}
	
	public void setSalario(float Salario) {
		if(Salario == 0) {
			
		}else {
			this.Salario = Salario;
		}
	}
	
}
