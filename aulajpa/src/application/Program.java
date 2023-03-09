package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa(1, "bene@gmail.com", "bene");
		Pessoa p2 = new Pessoa(2, "pedro@gmail.com", "pedro");
		Pessoa p3 = new Pessoa(3, "joelma@gmail.com", "joelma");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
