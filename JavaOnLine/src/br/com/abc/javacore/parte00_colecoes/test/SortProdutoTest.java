// Aula 121 - Coleções parte 06 - Ordenação de Listas usando Comparable
// Aula 122 - Coleções parte 07 - Ordenação de Listas usando Comparator
package br.com.abc.javacore.parte00_colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoNomeComparator implements Comparator<Produto>
{
	// Como é uma classe externa, ela precisa receber dois parâmetros.
	@Override public int compare(Produto arg0, Produto arg1)
	{
		return 0;
	}
}
public class SortProdutoTest
{
	public static void main(String[] args)
	{
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("Notebook Lenovo", 2000, "121545");
		Produto produto2 = new Produto("Picanha", 200, "545");
		Produto produto3 = new Produto("Teclado", 120, "787");
		Produto produto4 = new Produto("Celular", 4200, "12154");
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		//
		// Collections.sort(produtos);
		// erro de compilação -> Ele não tem como saber qual dos itens deve
		// ordenar -> se por String ou por número
		// existe uma Interface chamada Comparable que utiliza um algoritmo
		// de ordenação;
		// Devemos implementar a Interface Comparable na classe Produto
		//
		// Tipos de coleções são dois tipos: Ordenadas (ordered) e Classificadas
		// ou sortidas (sorted).
		//
		Collections.sort(produtos);
		for (Produto produto : produtos)
		{
			System.out.println(produto);
		}
	}
}
