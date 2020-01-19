package br.com.abc.javacore.parte02_introducaoclasses.test;

import br.com.abc.javacore.parte02_introducaoclasses.classes.Carro;

// 
public class CarroTest
{
	public static void main(String[] args)
	{
		// Forma completa
		// br.com.abc.javacore.parte02_introducaoclasses.classes.Carro carro; -
		// Forma abreviada devido à importação do pacote (localização)
		// Carro carro = new Carro();
		//
		// criação ou instaciação do objeto;
		Carro carro = new Carro();
		System.out.println(carro); // será impressa, um endereço para referência
									// de memória para o objeto carro.
		carro.modelo = "Fusca";
		carro.placa = "HDF4545";
		carro.velocidadeMaxima = 120;
		System.out.println(carro.velocidadeMaxima); // Variáveis locais não
													// recebem valores padrão na
													// inicialização. Já
													// variáveis de classes
													// Wrapper recebem por
													// padrão os valores null
													// por padrão.
	}
}
