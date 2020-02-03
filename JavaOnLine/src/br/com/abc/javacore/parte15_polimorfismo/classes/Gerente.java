// Aula 64: Polimorfismo pt 01
// Aula 66: Polimorfismo pt 03

package br.com.abc.javacore.parte15_polimorfismo.classes;

// Variável de referência é similar um controle remoto (diz o que será
// executado). Quem executa o comando é a a TV(objeto - gerente).
public class Gerente extends Funcionario
{
	private double participacaoLucro;
	
	public Gerente()
	{
		super();
	}
	
	public Gerente(String nome, double salario)
	{
		super(nome, salario);
	}
	
	public Gerente(String nome, double salario, double participacaoLucro)
	{
		super(nome, salario);
		this.participacaoLucro = participacaoLucro;
	}
	
	public double getParticipacaoLucro()
	{
		return participacaoLucro;
	}
	
	public void setParticipacaoLucro(double participacaoLucro)
	{
		this.participacaoLucro = participacaoLucro;
	}
	
	@Override public void calcularPagamento()
	{
		this.salario = this.salario + this.participacaoLucro;
	}
}
