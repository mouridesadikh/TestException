package test;

import model.Compte;

public class Testeur {

	public static void main(String[] args) {
		Compte c1 = new Compte(1, 100);
		try {
			c1.retirer(200);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
