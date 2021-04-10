// Aula 122: Coleções pt 07 Ordenação de listas e arrays com Comparator
package br.com.abc.javacore.parte00_colecoes.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.abc.javacore.parte00_colecoes.test.Produto;

// Essa classe servirá para implementar a forma como o Produto será ordenado. Neste caso, por nome.
class ProdutoNomeComparator implements Comparator<Produto>
{
	@Override public int compare(Produto o1, Produto o2)
	{
		return o1.getNome().compareTo(o2.getNome());
	}
}
//
public class SortProdutoTeste
{
	public static void main(String[] args)
	{
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", 2000, "Laptop Lenovo");
		Produto produto2 = new Produto("321", 26.4, "Picanha");
		Produto produto3 = new Produto("879", 1000, "Teclado Razer");
		Produto produto4 = new Produto("012", 3000, "Samsung Galaxy S7 64GB");
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		// Se tentar ordenar estes itens através de Colletions Dará um erro de
		// compilação, uma vez que não tem como o compilador saber se ordenação
		// deverá ser feita pelo valor, serialNumber ou pela Descrição.
		// Por isso, a classe produto deverá implementar a interface Comparable
		//
		// Impressão antes da ordenação
		// System.out.println(produtos);
		//
		// // Ordenação por serialNumber
		// Collections.sort(produtos);
		// System.out.println(produtos);
		//
		// Ordenação por nome usando Comparator (No caso, nome)
		// Collections.sort(produtos, new ProdutoNomeComparator());
		// System.out.println(produtos);
		//
		// Também é possível usar essa mesma estratégia para Arrays com a classe
		// Arrays.
		Produto[] produtosArray = new Produto[4];
		produtosArray[0] = produto1;
		produtosArray[1] = produto2;
		produtosArray[2] = produto3;
		produtosArray[3] = produto4;
		// Usando o toString de Arrays
		System.out.println(Arrays.toString(produtosArray));
		Arrays.sort(produtosArray);
		System.out.println(Arrays.toString(produtosArray));
	}
}
