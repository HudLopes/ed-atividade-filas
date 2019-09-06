package upe.ecomp.ed.questao2;

public enum StatusEnum {

	ABERTA(1), FECHADA(0);
	
	private int status;
	
	StatusEnum( int status){
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
