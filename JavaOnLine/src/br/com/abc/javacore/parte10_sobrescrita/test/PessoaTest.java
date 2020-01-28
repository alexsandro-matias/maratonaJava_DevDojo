package br.com.abc.javacore.parte10_sobrescrita.test;

import br.com.abc.javacore.parte10_sobrescrita.classes.Pessoa;

public class PessoaTest
{
	public static void main(String[] args)
	{
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(300);
		pessoa.setNome("Maria Joaquina");
		// Mesma saída nas linhas abaixo
		System.out.println(pessoa);
		System.out.println(pessoa.toString());
		// Já que será impressa o endereço de memória em Hexadecimal da variável de
		// referência.
		// Para impressão devemos fazer a sobrescrita do método toString() do Object.
		// Então deve ser definido o método da mesma forma que na classe pai.
	}
}
