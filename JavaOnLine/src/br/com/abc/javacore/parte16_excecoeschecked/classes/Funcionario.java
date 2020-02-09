//Aula 76 - Exceptions e regras para sobrescrita pt 10
package br.com.abc.javacore.parte16_excecoeschecked.classes;

import br.com.abc.javacore.parte16_excecoes.customexception.LoginInvalidoException;

public class Funcionario extends Pessoa
{
	public void salvar() throws LoginInvalidoException
	{
		// Podemos lançar uma exceção qualquer da superclasse, porém somente aquelas
		// presentes na classe mãe.
	}
}
