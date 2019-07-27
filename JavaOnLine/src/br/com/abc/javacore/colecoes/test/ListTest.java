// Aula 119  - Coleçõs parte 04
// Aula 120 - Coleções parte 05

package br.com.abc.javacore.colecoes.test;

import java.util.List;
import java.util.ArrayList;

public class ListTest
{
	public static void main(String[] args)
	{
		// até a versão 5 do Java
		// Conceito de List -> antigamente
		// para o crescimento indefinido dos arrays, usamos os Arrayslist
		// ArrayList nomes = new ArrayList();
		//  Erro de compilação por que não é determinado o tipo
		// 
		//
		// Por isso teríamos que passar um Object no processo.
		// Por isso foi criado o Generics que definem o tipo da coleção.
		List<String> nomes = new ArrayList<>();
		nomes.add("Alexsandro");
		nomes.add("Matias");
		nomes.add("Alexsandro2");
		nomes.add("Matias2");
		// se tentar adicionar um objeto diferente do tipo parametrizado,
		// causará um erro de compilação.
		// nomes.add(new Celular());
		// Já que ele espera um String
		//
		//
		for (Object nome : nomes)
		{
			System.out.println(nome);
		}
		// Se tentarmos realizar a adição dentro do for dará um erro de
		// compilação
		//
		// for (Object nome : nomes)
		// {
		// nomes.add("Erro");
		// System.out.println(nome);
		// }
		// Isso acontece com o foreach -> não se pode alterar o tamanho do
		// ArrayList. Uma vez por que na sintaxe do Java ele sabe o tamanho
		// determinado do vetor. O que não é o caso do foreach. a JVM não teria
		// a certeza que os elementos estariam no mesmo local em todo o processo
		//
		// percorrendo pelo índice -> ocorre um loop infinito
		// for (int i = 0; i < nomes.size(); i++)
		// {
		// nomes.add("Suane");
		// System.out.println(nomes.get(i));
		// }
		//
		// isso acontece por que o tamanho não é fixo. Para fixá-lo podemos
		// atribuindo o valor a uma variável.
		int size = nomes.size();
		for (int i = 0; i < size; i++)
		{
			nomes.add("Suane");
			System.out.println(nomes.get(i));
		}
		//
		// Regras para sintaxe do ArrayList
		// 1. Não é possível criar coleções de tipos primitivos. Por que
		// internamente são chamados os métodos referentes a objetos equals e
		// hashcode.
		//
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		// Mesmo jogando tipos primitivos, o Java vai se encarregar de fazer
		// Boxing desse valor para Integer.
		for (Integer num : numeros)
		{
			System.out.println(num);
		}
		//
		// Outro método é o de remover. Ele tem duas opções: Ou passando o index
		// ou Object. Para saber o Objeto é através do equals();
		nomes.remove(0); // Remove a posição
		nomes.remove("Matias"); // Remove o objeto -> retorna um boolean ->
								// Sensite Case
		System.out.println(nomes);
		// Para adicionar outra lista, usamos o addAll();
		List<String> nomes2 = new ArrayList<String>();
		nomes2.addAll(nomes);
		for (int i = 0; i < nomes2.size(); i++)
		{
			System.out.println(nomes2.get(i));
		}
		
		//para limpar uma lista
		nomes2.clear();
		//mas a objeto ou a referência dele
	}
}
