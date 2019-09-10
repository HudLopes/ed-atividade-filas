package upe.ecomp.ed.questao3;

public class No {

	private char caractere;
	private No proximo;
	
	public No(char letra) {
		this.caractere = letra;
	}
	
	public char getCaractere() {
		return caractere;
	}
	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
