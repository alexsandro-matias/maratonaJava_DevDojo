//Aula 41 - Blocos de inicializacao
//Aula 43 - Blocos de inicializacao com Métodos estáticos 
//Aula 44 - Blocos de inicializacao com Métodos estáticos 

package br.com.abc.javacore.parte07_modificadorestatico.test;

import br.com.abc.javacore.parte07_modificadorestatico.classes.Cliente;

public class ClienteTest
{
	public static void main(String[] args)
	{
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		System.out.println("Quantidade de parcelas: ");
//		for (int parcela : cliente.getParcelas())
//		{
//			System.out.print(parcela + " ");
//		}
		System.out.println("Tamanho: "+Cliente.getParcelas().length);
		System.out.println("Tamanho: "+Cliente.getParcelas().length);
		System.out.println("Tamanho: "+Cliente.getParcelas().length);
		
	}
}
