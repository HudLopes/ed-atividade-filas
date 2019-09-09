package upe.ecomp.ed.questao5;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fila fila1 = new Fila();
		Fila fila2 = new Fila();
		Fila retorno = new Fila();
		
		
		fila1.enqueue(1);
		fila1.enqueue(4);
		fila1.enqueue(5);
		
		fila2.enqueue(2);
		fila2.enqueue(3);
		fila2.enqueue(6);
		
		retorno.preenche(fila1, fila2, retorno);
		retorno.imprimir();
	}

}
