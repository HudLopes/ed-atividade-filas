package upe.ecomp.ed.questao3;

public class Teste {

	public static void main(String[] args) {
		FilaCircular fila = new FilaCircular();
		
		fila.enqueueString("arara");
		
		fila.imprimir();
		
		FilaCircular tmp = new FilaCircular();
		FilaCircular retorno = new FilaCircular();
		FilaCircular invertida = fila.inverte(fila, tmp, retorno);
		
		System.out.print("\n");
		invertida.imprimir();
		System.out.print("\n");
		//problema, fila ta ficando null
		System.out.print("eh palidromo? " + fila.isPalindromo(invertida));
	}

}
