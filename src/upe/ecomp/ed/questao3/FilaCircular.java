package upe.ecomp.ed.questao3;

public class FilaCircular {

	No inicio, fim;

	public FilaCircular() {
		this.inicio = null;
		this.fim = null;
	}

	public void enqueueString(String entrada) {
		for (int i = 0; i < entrada.length(); i++) {
			this.enqueue(entrada.charAt(i));
		}
	}

	public void enqueue(char letra) {
		No novo = new No(letra);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
			novo.setProximo(inicio);
		}
	}

	public char dequeue() {
		char retorno = ' ';
		if (inicio == fim && inicio != null) {
			retorno = inicio.getCaractere();
			inicio = null;
			fim = null;
		} else {
			if (inicio != null) {
				retorno = inicio.getCaractere();
				inicio = inicio.getProximo();
				fim.setProximo(inicio);
				if (inicio == null)
					fim = null;
			}
		}

		return retorno;
	}

	public boolean isEmpty() {
		return inicio == null || inicio.getCaractere() == ' ';
	}

	public void imprimir() {
		if (!isEmpty()) {
			No p = inicio;
			System.out.print(p.getCaractere());
			p = p.getProximo();
			while (p != inicio) {
				System.out.print(" -> " + p.getCaractere());
				p = p.getProximo();
			}
			System.out.println("");
		} else {
			System.out.println("Fila vazia!");
		}
	}

	public FilaCircular inverte(FilaCircular fila, FilaCircular tmp, FilaCircular retorno) {
		while (!fila.isEmpty() || !tmp.isEmpty()) {
			if (fila.inicio == fila.fim) {
				retorno.enqueue(fila.dequeue());
				inverte(tmp, fila, retorno);
			}
			tmp.enqueue(fila.dequeue());
		}
		return retorno;
	}

	boolean isPalindromo(FilaCircular invertida){
		boolean r = true;
		while (!this.isEmpty() || !invertida.isEmpty()) {
			if (this.inicio.getCaractere() == invertida.inicio.getCaractere()) {
				this.dequeue();
				invertida.dequeue();
			} else {
				r = false;
				break;
			}
		}
		return r;
	}

}
