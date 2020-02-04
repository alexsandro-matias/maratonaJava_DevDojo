//Aula 67 -  Exceptions pt 01
//Aula 68 -  Exceptions pt 02
package br.com.abc.javacore.parte16_excecoes.classes;

public class Excecoes
{
	// Exceções são usadas quando os códigos não executa algo inesperado (fluxos
	// anormais). A conexão
	// com o banco de dados caso não haja essa conexão? Quando ocorre alguma exceção
	// esta foi lançada filhas de THROWABLE que são ERROR ou EXCEPTION. No primeiro
	// caso, ela age de forma diferente. Já que não existe tratamento e o programa
	// pode parar de funcionar. Um exemplo é a limitação de memória alocada para JVM
	// não seja suficiente para execução. As exceções são de dois tipos:
	// - Checked (checado) - é obrigatório que seja implementado o tratamento. -
	// Conexão com o banco de dados. - IOException ou SQLExcepion.
	// - Unchecked (não checado) - Não é obrigatório que seja implementado o
	// tratamento. Geralmente erros de lógica. - acessando uma posição no vetor que
	// não existe. - filhas de RunTimeException - NullPointerException.
}
