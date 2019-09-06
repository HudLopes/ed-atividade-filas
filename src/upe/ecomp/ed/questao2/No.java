package upe.ecomp.ed.questao2;

public class No {
	private Cliente cliente;
	private No proximo;

	public No(Cliente c) {
		setCliente(c);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente c) {
		this.cliente = c;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
