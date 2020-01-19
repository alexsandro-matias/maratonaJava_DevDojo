package br.com.abc.javacore.parte07_modificadorestatico.classes;
//Aula 42 - modificador de acesso static 
//Aula 43 - Métodos estáticos 
//Aula 44 - Bloco de Inicialização estáticos 

public class Carro
{
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240; // velocidade determinada no
													// plano de
	// negócio que deve ser
	// compartilhada para todos os
	// carros.
	
	public Carro(String nome, double velocidadeMaxima)
	{
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprimeCarro()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		// System.out.println("Velocidade Limite: " + this.velocidadeLimite);
		// Como o THIS pertence ao objeto e não a classe, esse warning irá ficar
		// aparecendo e podemos deixar apenas o nome do atributo.
		System.out.println("Velocidade Limite: " + velocidadeLimite);
		System.out.println("------------------------------------------------");
		// Se pode alterar qualquer método para estático somente eles não estejam
		// acessando atributos de classe.
		// public static void imprimeCarro() - Essa assinatura daria erro de compilação,
		// Uma vez que métodos estáticos somente acessar atributos estáticos.
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getVelocidadeMaxima()
	{
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(double velocidadeMaxima)
	{
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	// Esse trecho não deve ser utilizado, já que os objetos não devem alterar
	// os valores estáticos.
	//
	public static double getVelocidadeLimite()
	{
		return velocidadeLimite;
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite)
	{
		// velocidadeLimite = velocidadeLimite;
		Carro.velocidadeLimite = velocidadeLimite; // nesse caso o valor será alterado.
	}
	// No caso do método setter o escopo de classe superior não está sobrepondo o
	// atributo do classe, VELOCIDADELIMITE já no momento que o parâmetro com o
	// mesmo nome do parâmetro do método, quem prevalece é o atributo. Logo quando o
	// método acaba, o valor do atributo local acaba com juntamente com o método
}