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
		} else {
			// entrada invalida
		}
		Fila tmp = new Fila();
		Fila retorno = new Fila();
		Fila invertida = fila.inverte(fila, tmp, retorno);
		
		invertida.imprimirFatoracao();
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
		retornaFatoracaoPrima(20);
		System.out.print("\n");
		retornaFatoracaoPrima(3960);
		System.out.print("\n");
		//output no pdf da atividade está faltando o 13
		retornaFatoracaoPrima(6552);
	}

}
