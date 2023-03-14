// Aula 64: Polimorfismo pt 01
// Aula 65: Polimorfismo pt 02
// Aula 66: Polimorfismo pt 03
package br.com.abc.javacore.parte15_polimorfismo.test;

import br.com.abc.javacore.parte15_polimorfismo.classes.Funcionario;
import br.com.abc.javacore.parte15_polimorfismo.classes.Gerente;
import br.com.abc.javacore.parte15_polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.parte15_polimorfismo.classes.Vendedor;

public class polimorfismoTest
{
	public static void main(String[] args)
	{
		Gerente gerente = new Gerente("Geraldo", 5000, 2000);
		Vendedor vendedor = new Vendedor("Yuri", 2000, 2000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		// relatorio.relatorioPagamentoGerente(ceara);
		// relatorio.relatorioPagamentoVendedor(valter);
		// referenciando. E que sempre quem irá executar os métodos são os
		// objetos.
		// As classes somente dizem quais os métodos e atributos que podem ser
		// chamados.
		// System.out.println(funcionario.getSalario());
		// Passando um método mais genérico:
		Funcionario funcionario = vendedor; // o objeto funcionário está
		// referenciando o mesmo objeto que
		// vendedor está
		relatorio.relatorioPagamentoGenerico(gerente);
		// Quando descomentarmos a linha de baixo, apresentará o seguinte erro
		// em tempo
		// de execução:
		// Gerando relatório de pagamento:
		// Nome do Funcionário: Yuri
		// Salário: R$ 2100.0
		// Exception in thread "main" java.lang.ClassCastException:
		// br.com.abc.javacore.parte15_polimorfismo.classes.Vendedor cannot be
		// cast to
		// br.com.abc.javacore.parte15_polimorfismo.classes.Gerente
		// at
		// br.com.abc.javacore.parte15_polimorfismo.classes.RelatorioPagamento.relatorioPagamentoGenerico(RelatorioPagamento.java:31)
		// at
		// br.com.abc.javacore.parte15_polimorfismo.test.polimorfismoTest.main(polimorfismoTest.java:25)
		//
		// Isso ocorre por que se tentou fazer um casting de uma classe que não
		// está
		// mesma hierarquia. Mesmo vendedor e gerente serem filhas de
		// funcionário. Não
		// existe nenhuma relação entre elas. Ou seja, não é possível que
		// gerente faça
		// referência à classe vendedor. Para resolver esse problema, usaremos
		// um
		// operador chamando instanceof() que verifica o tipo do objeto
		relatorio.relatorioPagamentoGenerico(vendedor);
	}
}
