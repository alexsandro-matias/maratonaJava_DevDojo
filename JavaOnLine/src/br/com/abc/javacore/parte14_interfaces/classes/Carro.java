// Aula 62: Interfaces pt 01
package br.com.abc.javacore.parte14_interfaces.classes;

public class Carro implements Transportavel, Tributavel
{
	// Uma classe que não é relacionada com a classe Produto.
	@Override public void calcularImposto()
	{
	}

	@Override public void calculaFrete()
	{
	}
}
