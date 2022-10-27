package br.com.abc.javacore.parte09_heranca.test;

import br.com.abc.javacore.parte09_heranca.classes.Endereco;
import br.com.abc.javacore.parte09_heranca.classes.Funcionario;
import br.com.abc.javacore.parte09_heranca.classes.Pessoa;

public class HerancaTest
{
	public static void main(String[] args)
	{
		// Pessoa pessoa = new Pessoa();
		// Endereco endereco = new Endereco();
		// pessoa.setCpf("132165465465");
		// pessoa.setNome("Jão britto");
		// endereco.setBairro("COHAB");
		// endereco.setRua("Rua Severino de Barros");
		// pessoa.setEndereco(endereco);
		// pessoa.print();
		//
		Funcionario doria = new Funcionario();
		Endereco endereco2 = new Endereco();
		doria.setNome("João Dória");
		doria.setCpf("145447859");
		endereco2.setBairro("Ouro Preto");
		endereco2.setRua("Jatobá");
		doria.setEndereco(endereco2);
		doria.setSalario(1500);
		// Quem executa os métodos sempre serão as variáveis de referência
		// (objetos)
		doria.print();
	}
}
