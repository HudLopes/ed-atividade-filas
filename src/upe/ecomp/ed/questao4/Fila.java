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
		return inicio == null;
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

	public No getInicio() {
		return inicio;
	}

}
