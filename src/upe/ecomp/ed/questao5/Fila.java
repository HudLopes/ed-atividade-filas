package upe.ecomp.ed.questao5;

public class Fila {

	No inicio, fim;
	
	void preenche(Fila f1, Fila f2, Fila retorno) {
		f1.fim.setProximo(f2.inicio);
		f1.fim = f2.fim;
		
		retorno = f1;
		
		retorno.ordena();
	}
	
	void ordena() {
		No tmp = inicio;
		while(tmp != null) {
			if(tmp.getValor() > tmp.getProximo().getValor()) {
				No tmp2 = tmp;
				tmp = tmp.getProximo();
			}
			
			tmp = tmp.getProximo();
		}
	}
}
