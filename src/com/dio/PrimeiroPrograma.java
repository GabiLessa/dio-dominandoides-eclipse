package com.dio;

public class PrimeiroPrograma {

	private static Gato gato;

	public static void main(String[] args) {
        
		System.out.println("Hello Word! How are you?");
		System.out.println(gato);
	}

	public static Gato getGato() {
		return gato;
	}

	public static void setGato(Gato gato) {
		PrimeiroPrograma.gato = gato;
	}

}
