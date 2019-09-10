package upe.ecomp.ed.questao4;

public class Fila {

	No inicio, fim;

	public int dequeue() {
		int r = -1;
		if (inicio != null) {
			r = inicio.getValor();
			inicio = inicio.getProximo();
			if (inicio == null)
				fim = null;
		}
		return r;
	}

	public void enqueue(int c) {
		No novo = new No(c);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
	}

	public boolean isEmpty() {
		return inicio == null || inicio.getValor() == -1;
	}

	public Fila inverte(Fila fila, Fila tmp, Fila retorno) {
		while (!fila.isEmpty() || !tmp.isEmpty()) {
			if (fila.inicio == fila.fim) {
				retorno.enqueue(fila.dequeue());
				inverte(tmp, fila, retorno);
			}
			tmp.enqueue(fila.dequeue());
		}
		return retorno;
	}

	public void imprimir() {
		if (!isEmpty()) {
			No p = inicio;
			while (p != null) {
				System.out.print(" -> " + p.getValor());
				p = p.getProximo();
			}
			System.out.println("");
		} else {
			System.out.println("Fila vazia!");
		}
	}

	public void imprimirFatoracao() {
		if (!isEmpty()) {
			No p = inicio;
			System.out.print(p.getValor());
			p = p.getProximo();
			while (p != null) {
				System.out.print(" * " + p.getValor());
				p = p.getProximo();
			}
			System.out.println("");
		} else {
			System.out.println("Fila vazia!");
		}
	}

	public No getInicio() {
		return inicio;
	}

}
