package application;

import entities.Client;

public class HashCodeEquals {

	public static void main(String[] args) {
		/*
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		
		System.out.println(a.equals(b)); false
		System.out.println(a.hashCode()); 74113750
		System.out.println(b.hashCode()); 2043454
		System.out.println(c.hashCode()); 74113750
		*/
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); //mesmo o conteudo sendo iguais, 
									  //retornara False, pois ele compara as referencias 
									  //de memoria quando instanciamos um objeto.
									  //No caso de valores literais, o compilador ira tratar de
									  //maneiera diferente.
		                              //Ex val. literal: String s1 = "abc";
	}									

}
