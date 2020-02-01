package br.com.abc.javacore.parte15_polimorfismo.classes;

public class RelatorioPagamento
{
	public void relatorioPagamentoGerente(Gerente gerente)
	{
		System.out.println("Gerando relatório de pagamento para gerente:");
		gerente.calculaSalario();
		System.out.println("Nome do gerente: " + gerente.getNome());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("------------------------------------------------");
	}

	public void relatorioPagamentoVendedor(Vendedor vendedor)
	{
		System.out.println("Gerando relatório de pagamento para o vendedor:");
		vendedor.calculaSalario();
		System.out.println("Nome do vendedor: " + vendedor.getNome());
		System.out.println("Salário: " + vendedor.getSalario());
		System.out.println("------------------------------------------------");
	}
}
