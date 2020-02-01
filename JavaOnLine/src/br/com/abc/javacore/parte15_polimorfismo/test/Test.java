// Aula 64: Polimorfismo pt 01

package br.com.abc.javacore.parte15_polimorfismo.test;

import br.com.abc.javacore.parte15_polimorfismo.classes.Gerente;
import br.com.abc.javacore.parte15_polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.parte15_polimorfismo.classes.Vendedor;

public class Test
{
	public static void main(String[] args)
	{
		Gerente ceara = new Gerente("Geraldo", 5000, 2000);
		Vendedor valter = new Vendedor("Yuri", 2000, 2000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		relatorio.relatorioPagamentoGerente(ceara);
		relatorio.relatorioPagamentoVendedor(valter);
	}
}
