package upe.ecomp.ed.questao2;

public class Loja {

	Fila fila1, fila2, fila3;

	public Loja() {
		this.fila1 = new Fila();
		Cliente hudson = new Cliente("hudson");
		fila1.enqueue(hudson);
//		this.fila2 = new Fila(1);
//		this.fila3 = new Fila(1);
	}

	public String abreFila() {

		return "null";
	}

	public void chegaNovo(Cliente c) {

	}

	public void atendeFila(int n) {
		Fila fila = this.getFila(n);
		if (fila != null) {
			if (fila.isFilaAberta(n)) {
				Cliente clienteAtendido = fila.dequeue();
				if (clienteAtendido == null) {
					System.out.print("Não havia ninguem na fila");
				} else {
					System.out.print("Cliente atendido: " + clienteAtendido.getNome()); 
				}
			} else {
				System.out.print("A fila está fechada");
			}
		} else {
			System.out.print("Esta fila não existe");
		}
	}


	public Fila getFila(int index) {
		if (index == 1) {
			return fila1;
		} else if (index == 2) {
			return fila2;
		} else if (index == 3) {
			return fila3;
		} else {
			return null;
		}
	}

}
