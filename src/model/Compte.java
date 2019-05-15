package model;

public class Compte {
	private int numero;
	private int solde;

	
	public Compte(int numero, int solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	public void retirer(int montant) throws Exception {
		if (this.solde < montant) {
			throw new Exception("solde insufisant");
		} else {
			this.solde = this.solde - montant;
		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	
}
