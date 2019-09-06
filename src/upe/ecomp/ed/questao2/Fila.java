package upe.ecomp.ed.questao2;

public class Fila {

	private No inicio, fim;
	private StatusEnum status;

	Fila() {
		inicio = null;
		fim = null;
		this.status = StatusEnum.ABERTA;
	}

	public void enqueue(Cliente c) {
		No novo = new No(c);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
	}

	public Cliente dequeue() {
		Cliente clienteAtendido = null;
		if (inicio != null) {
			clienteAtendido = inicio.getCliente();
			inicio = inicio.getProximo();
			if(inicio==null)
				fim = null;
		}
		return clienteAtendido;
	}
	
	public boolean isFilaAberta(int n) {
		boolean r = false;
		if(this.getStatus() == StatusEnum.ABERTA) {
			r = true;
		}
		return r;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public StatusEnum getStatus() {
		return status;
	}

	
}
