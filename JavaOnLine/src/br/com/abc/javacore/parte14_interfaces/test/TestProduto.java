package br.com.abc.javacore.parte14_interfaces.test;

import br.com.abc.javacore.parte14_interfaces.classes.Produto;

public class TestProduto
{
	public static void main(String[] args)
	{
		Produto notebook = new Produto("Notebook", 4, 3000);
		notebook.calculaFrete();
		notebook.calcularImposto();
		System.out.println(notebook);
	}
}
