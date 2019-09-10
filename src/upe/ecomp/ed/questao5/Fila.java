package upe.ecomp.ed.questao5;

public class Fila {

	No inicio, fim;

	void preenche(Fila f1, Fila f2, Fila retorno) {
		No tmp1 = f1.getInicio();
		No tmp2 = f2.getInicio();

		do {
			if (f1.isEmpty()) {
				retorno.enqueue(f2.dequeue());
			} else if (f2.isEmpty()) {
				retorno.enqueue(f1.dequeue());
			} else {
				if (tmp1.getValor() < tmp2.getValor()) {
					retorno.enqueue(f1.dequeue());
					tmp1 = tmp1.getProximo();
				} else {
					retorno.enqueue(f2.dequeue());
					tmp2 = tmp2.getProximo();
				}
			}
		} while (!f1.isEmpty() || !f2.isEmpty());
	}

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
			System.out.print(p.getValor());
			p = p.getProximo();
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
