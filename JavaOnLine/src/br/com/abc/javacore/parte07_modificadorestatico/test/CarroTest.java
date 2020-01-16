package br.com.abc.javacore.parte07_modificadorestatico.test;
// Aula 42 - modificador de acesso static 
import br.com.abc.javacore.parte07_modificadorestatico.classes.Carro;

public class CarroTest
{
	public static void main(String[] args)
	{
		Carro carro1 = new Carro("Audi", 255);
		Carro carro2 = new Carro("BMW", 275);
		Carro carro3 = new Carro("Mercedez", 290);
		//
		carro1.imprimeCarro();
		carro2.imprimeCarro();
		carro3.imprimeCarro();
		System.out.println("##########################");
		// Neste caso podemos ainda alterar o valor da velocidade limite mesmo
		// sendo atributo privado.
		// Essa linha dará erro. Já que devemos acessar a classe e não o objeto.
		// carro1.setVelocidadeLimite(220);
		Carro.velocidadeLimite = 220;
		carro1.imprimeCarro();
		carro2.imprimeCarro();
		carro3.imprimeCarro();
		// Neste momento todas as velocidades limite passarão a ser 220. Já que
		// estamos alterando o atributo da classe e não mais o do objeto. Por
		// isso, a alteração se espalha para todos os objetos.
		// Se fosse utilizado em vez de:
		// carro1.setVelocidadeLimite(220);
		// fosse utilizado:
		// carro2.setVelocidadeLimite(220);
		// o efeito seria o mesmo, já que estamos alterando um atributo
		// estático.
		// Assim precisamos de algo que seja padrão à classe e não ao objeto.
		// Por isso usamos o modificado static.
		// O atributo estático é o primeiro a ser criado no momento da criação
		// do objeto
	}
}
