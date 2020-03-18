//Aula 116 - Coleções parte 01
//Aula 117 - Coleções parte 02
package br.com.abc.javacore.colecoes.test;

public class EqualsTest
{
	public static void main(String[] args)
	{
		String nome1 = "William";
		String nome2 = "William";
		System.out.println(nome1 == nome2);
		//
		// retorna true, uma vez que as Strings ficam armazenadas no pools de
		// Strings e significa que está sendo referenciado o mesmo objeto.
		//
		String nome3 = "Alexsandro";
		String nome4 = new String("Alexsandro");
		System.out.println(nome3 == nome4);
		// Já nesta situação, retorna false, uma vez que quando fizemos o new ->
		// estamos colocando o objeto no heap e eles estão em locais diferentes
		// (== faz a comparação dessa referência)
		// O mesmo acontece com as classes Rapper -> retorna false já que o
		// endereço de memória é diferente
		Integer int1 = 5;
		Integer int2 = new Integer(5);
		System.out.println(int1 == int2);
		// Para em vez da referência, quisermos os valores, teremos que usar o
		// método equals()
		//
		System.out.println(int1.equals(int2)); // Agora retorna true
		Celular c1 = new Celular("Iphone", "1234");
		Celular c2 = new Celular("Samgung", "1234");
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
	}
}