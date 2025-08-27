package reservaSala;

public class Sala {
	private int sala;
	private int qntLugar;
	

	public int getSala() {
		return this.sala;
	}
	
	public int getQntLugar() {
		return this.qntLugar;
	}
	
	public void setSala(int sala) {
		if(sala == 0) {
			System.out.println("sala nao pode ser vazio");
		}else {
			this.sala = sala;
		}	
	}
	
	public void setQntLugar(int qntLugar) {
		if(qntLugar == 0) {
			System.out.println("quantidade de lugar nao pode ser vazio");
		}else {
			this.qntLugar = qntLugar;
		}	
	}
}
