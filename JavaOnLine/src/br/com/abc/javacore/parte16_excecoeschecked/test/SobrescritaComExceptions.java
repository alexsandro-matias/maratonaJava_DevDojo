package br.com.abc.javacore.parte16_excecoeschecked.test;

import br.com.abc.javacore.parte16_excecoeschecked.classes.Funcionario;
import br.com.abc.javacore.parte16_excecoeschecked.classes.Pessoa;

public class SobrescritaComExceptions
{
	public static void main(String[] args)
	{
		Funcionario funcionario = new Funcionario();
		Pessoa pessoa = new Pessoa();
		// funcionario.salvar();
		// Nenhum erro acontece por que o método sobrescrito pode não lançar nenhuma
		// exceção. Porém se fizermos para pessoa, teremos que tratar a exceção.
		// try
		// {
		// pessoa.salvar();
		// }
		// catch (FileNotFoundException | LoginInvalidoException e)
		// {
		// e.printStackTrace();
		// }
		//
		// Isso acontece por que as classes filhas podem sofrer alterações no processo
		// que podem lançar novas exceções.
	}
}
