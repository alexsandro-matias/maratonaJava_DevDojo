//Aula 120 - Coleções parte 05
package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest
{
	public static void main(String[] args)
	{
		Celular celular1 = new Celular("Galaxy S7", "1234567");
		Celular celular2 = new Celular("Iphone", "9898989");
		Celular celular3 = new Celular("Sony Xperia", "0194454");
		// Sempre criar uma lista desta forma
		List<Celular> celulareslist = new ArrayList<Celular>();
		celulareslist.add(celular1);
		celulareslist.add(celular2);
		celulareslist.add(celular3);
		for (Celular celular : celulareslist)
		{
			System.out.println(celular);
		}
		Celular celular4 = new Celular("Galaxy S7", "1234567");
		// Se fizer a comparação == irá dar false, uma vez que temos objetos
		// diferentes
		System.out.println(celular1 == celular4);
		System.out.println(celular1.equals(celular4));
		// Para verificar se um objeto pertence na lista
		System.out.println(celulareslist.contains(celular4));
	}
}
