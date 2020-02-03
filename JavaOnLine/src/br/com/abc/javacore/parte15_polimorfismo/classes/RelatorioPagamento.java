package br.com.abc.javacore.parte15_polimorfismo.classes;

public class RelatorioPagamento
{
	// public void relatorioPagamentoGerente(Gerente gerente)
	// {
	// System.out.println("Gerando relatório de pagamento para gerente:");
	// gerente.calcularPagamento();
	// System.out.println("Nome do gerente: " + gerente.getNome());
	// System.out.println("Salário: " + gerente.getSalario());
	// System.out.println("------------------------------------------------");
	// }
	//
	// public void relatorioPagamentoVendedor(Vendedor vendedor)
	// {
	// System.out.println("Gerando relatório de pagamento para o vendedor:");
	// vendedor.calcularPagamento();
	// System.out.println("Nome do vendedor: " + vendedor.getNome());
	// System.out.println("Salário: " + vendedor.getSalario());
	// System.out.println("------------------------------------------------");
	// }
	//
	public void relatorioPagamentoGenerico(Funcionario funcionario) // Parâmetros polimórficos
	{
		System.out.println("Gerando relatório de pagamento:");
		funcionario.calcularPagamento();
		System.out.println("Nome do Funcionário: " + funcionario.getNome());
		System.out.println("Salário: R$ " + funcionario.getSalario());
		// Mas temos um problema: Caso queiramos imprimir a partipação nos lucros do
		// gerente, a classe funcionario não enxerga a referência para tal atributo.
		// Mesmo vendedor e gerente serem filhas de funcionário. Não
		// existe nenhuma relação entre elas. Ou seja, não é possível que gerente faça
		// referência à classe vendedor. Para resolver esse problema, usaremos um
		// operador chamando instanceof() que verifica o tipo do objeto.
		if (funcionario instanceof Gerente)
		{
			Gerente gerente = (Gerente) funcionario; // casting explícito.
			System.out.println("Participação nos lucros: " + gerente.getParticipacaoLucro());
			System.out.println("------------------------------------------------");
		}
		if (funcionario instanceof Vendedor)
		{
			Vendedor vendedor = (Vendedor) funcionario; // Casting explícito novamente para mostrar total de vendas.
			System.out.println("Total de vendas: " + vendedor.getTotalVendas());
			System.out.println("------------------------------------------------");
			//
			// System.out.println("Total de vendas: " +((Vendedor) - casting sem uma
			// variável intermediária
			// funcionario).getTotalVendas()); - casting direto.
		}
	}
	//
	// Esse método é um casting - que representa um variável mais genérica
	// (superclasse) receber como parâmetro uma mais específica(subclasse). Isso
	// acontece por somente os objetos podem executar os métodos de acordo com as
	// regras de sobrescrita dos métodos das subclasses.
	//
}
