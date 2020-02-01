// Aula 57 - Enumerações pt 01
// Aula 58 - Enumerações pt 02
// Aula 59 - Enumerações pt 03
package br.com.abc.javacore.parte12_enum.test;

import br.com.abc.javacore.parte12_enum.classes.Cliente;
import br.com.abc.javacore.parte12_enum.classes.TipoCliente;
import br.com.abc.javacore.parte12_enum.classes.Cliente.TipoPagamento;

public class ClienteTest
{
	public static void main(String[] args)
	{
		// Cliente cliente = new Cliente(Cliente.PESSOA_FISICA, "Anna");
		// Cliente cliente2 = new Cliente(10, "Anna"); // Possível já que pode
		// ser
		// atribuído qualquer valor do tipo int,
		// mesmo sendo uma constante. Sugiram a partir do Java 5 para
		// resolver esse tipo de problema.
		Cliente cliente = new Cliente(TipoCliente.PESSOA_FISICA, "Anna", TipoPagamento.APRAZO);
		Cliente cliente2 = new Cliente(TipoCliente.PESSOA_FISICA, "José");
		//
		// O único atributo válido é um atributo TIPOCLIENTE, diferente disso,
		// dará um
		// erro de compilação. Por isso, o código se torna mais seguro, já que
		// não teria
		// como alguém fazer alguma alteração.
		System.out.println(cliente);
		System.out.println(cliente2);
		//
		// As enumerações podem ser criadas de duas formas:
		// 1. criando uma classe separada;
		// 2. Criando como atributo;
	}
}