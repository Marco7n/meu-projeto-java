package reservaSala;

public class Setor {
private String nome;

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
}
