//Aula 41 - Blocos de inicializacao
package br.com.abc.javacore.parte06_blocodeinicializacao.test;

import br.com.abc.javacore.parte06_blocodeinicializacao.classes.Cliente;

public class ClienteTest
{
	public static void main(String[] args)
	{
		Cliente cliente = new Cliente();
		System.out.println("Quantidade de parcelas: ");
		for (int parcela : cliente.getParcelas())
		{
			System.out.print(parcela + " ");
		}
	}
}
