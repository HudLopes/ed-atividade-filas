package upe.ecomp.ed.questao4;

public class Teste {

	public static void retornaFatoracaoPrima(int n) {
		Fila fila = new Fila();

		if (n > 1) {
			while (n % 2 == 0) {
				n = n / 2;
				fila.enqueue(2);
			}

			for (int i = 3; i <= n; i++) {
				if (i == n) {
					fila.enqueue(n);
				} else {
					if (primo(i)) {
						while (n % i == 0) {
							n = n / i;
							fila.enqueue(i);
						}
					}
				}
			}

			fila.imprimir();
		} else {
			// entrada invalida
		}
	}

	static boolean primo(int n) {
		if (n <= 3) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		retornaFatoracaoPrima(3960);
	}

}
