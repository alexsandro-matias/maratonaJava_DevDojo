//Aula 121 - Coleções parte 06 - Ordenação de listas com Comparable
package br.com.abc.javacore.parte00_colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest
{
	public static void main(String[] args)
	{
		List<String> nomes = new ArrayList<String>();
		nomes.add("William");
		nomes.add("Suane");
		nomes.add("Breno");
		nomes.add("Bruno");
		nomes.add(0, "Ana");
		// Para ordenação, uma possibilidade é classe Collections
		Collections.sort(nomes);
		// ele irá manter uma lista e fará a ordenação de acordo como uma String
		// deve ser ordenada.
		//
		for (String nome : nomes)
		{
			System.out.println(nome);
		}
		// Se fosse uma lista numérica
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(1.5);
		numeros.add(1.7);
		numeros.add(2.5);
		numeros.add(0.5);
		numeros.add(1.2);
		Collections.sort(numeros);
		System.out.println(numeros);
	}
}
