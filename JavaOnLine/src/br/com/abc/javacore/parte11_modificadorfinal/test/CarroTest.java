package br.com.abc.javacore.parte11_modificadorfinal.test;

import br.com.abc.javacore.parte11_modificadorfinal.classes.Carro;

public class CarroTest
{
	public static void main(String[] args)
	{
		Carro carro = new Carro();
		System.out.println(carro.toString());
		carro.getContador().setNome("Kyo");
	}
}
