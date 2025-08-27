package reservaSala;

import java.util.Date;


public class Reserva {
	private Date dataHora;
	private Sala sala;
	private Funcionario funcionario;
	private String[] listaFuncionarios;
	
	public Date getDataHora() {
		return this.dataHora;
	}
	
	public Funcionario getFuncionario() {
		return this.funcionario;
	}
	
	public Sala getSala() {
		return this.sala;
	}

	public void setDataHora(Date dataHora) {
		if(dataHora == null) {
			throw new IllegalArgumentException("Data e hora não pode ser vazio!");
		}else {
			
			this.dataHora = dataHora;
		}	
	}
	
	public void setSala (Sala sala) {
		if(sala == null) {
			throw new IllegalArgumentException("Informe o numero!!");
		}else {
			this.sala = sala;
		}	
	}
	public void setFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			throw new IllegalArgumentException("Informe um Funcionário!");
		}else {
			this.funcionario = funcionario;
		}	
	}
	
	
	
	
}
