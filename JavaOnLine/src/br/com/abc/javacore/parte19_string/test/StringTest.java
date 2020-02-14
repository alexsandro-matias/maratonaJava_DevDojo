//Aula 80 -  String pt 01
//Aula 81 -  String pt 02
//Aula 82 -  Performance de String
package br.com.abc.javacore.parte19_string.test;

public class StringTest
{
	public static void main(String[] args)
	{
		// Strings são imutáveis. E é uma classe que possue também características
		// iguais a uma classe.
		String nome = "Alexsandro";
		nome = nome.concat(" Matias"); // Atribuindo (referenciando) a concatenação à própria variável.
		// A mesma coisa que:
		// sobreNome += " matias ";
		System.out.println(nome); // Saída apenas o nome, já que ela é imutável. Nome está referenciando apenas
									// "Alexsandro"
		// System.out.println(nome + sobreNome);
		// Nesse processo a String anterior não alterada, a JVM criou outra String no
		// Heap.
		// String constant pool. Isso acontece para economia de memória [performance].
		// A classe String não pode gerar filhas, já que é FINAL.
		//
		String sobreNome = new String(" Matias");
		// Neste caso acima será criado nessa ordem:
		// 1 - Variável de referência;
		// 2 - Objeto do tipo String;
		// 3 - String no pool de Strings
		String teste = "Sandro";
		String teste2 = "123456789";
		String teste3 = "		Sandro		";
		System.out.println(teste.charAt(3));
		// Comparação de String - equals()
		System.out.println(teste.equals(teste));
		// Para ignorar a caixa
		System.out.println(teste.equalsIgnoreCase(teste));
		// comprimento da String método
		System.out.println(teste.length());
		// replace substituir
		System.out.println(teste.replace('o', 'a'));
		System.out.println(teste.toUpperCase());
		System.out.println(teste.toLowerCase());
		// Delimitando o início e o final da impressão
		System.out.println(teste2.substring(0, 2));
		// Tirando espaços vazios na String
		System.out.println(teste3.trim());// Usado em banco de dados para buscas por erros digitados pelo usuário.
		
		
	}
}
