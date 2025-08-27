package reservaSala;

public class Funcionario {
	private String nome;
	private Cargo cargo;
	private Setor setor;
	
	public String getNome() {
		return this.nome;
	}
	
	public Setor getSetor() {
		return this.setor;
	}
	public Cargo getCargo() {
		return this.cargo;
	}
	
	public void setNome(String nome) {
		if(nome == null||nome.trim().isEmpty()) {
			System.out.println("nome nao pode ser vazio");
		}else {
			this.nome = nome;
		}	
	}
	
	public void setCargo(Cargo cargo) {
		if(cargo == null) {
			System.out.println("cargo nao pode ser vazio");
		}else {
			this.cargo = cargo;
		}	
	}
	
	public void setSetor(Setor setor) {
		if(setor == null) {
			System.out.println("setor nao pode ser vazio");
		}else {
			this.setor = setor;
		}	
	}
}
