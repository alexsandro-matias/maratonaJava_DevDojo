//Aula 89: Expressões regulares pt 01
//Aula 90: Expressões regulares pt 02
//Aula 91: Expressões regulares pt 03
//Aula 92: Expressões regulares pt 04
package br.com.abc.javacore.parte21_expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest
{
	public static void main(String[] args)
	{
		// Expressões regulares é como se fosse uma linguagem de programação
		// dentro de
		// outra linguagem. Utiliza padrões para buscar informações em grandes
		// textos
		// dentro dos arquivos. Utilizados para buscas de CEP's' por seguem um
		// padrão. Serão utilizadas basicamente duas classes.
		String regex = "aba";
		// Um vez encontrado o padrão. Ele não será mais utilizado.
		String texto = "abaaayiuasdfabuiouioababiuoy";
		Pattern pattern = Pattern.compile(regex);
		// Porém é necessário fazer a compilação dessa expressão.
		// Em seguida temos
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto: " + texto);
		// System.out.println("Índice: 123456789");
		System.out.println("Expressão: " + matcher.pattern());
		System.out.println("Posições encontradas.");
		while (matcher.find())
		{
			System.out.println(matcher.start() + "");
		}
		System.out.println("*******************************************");
		// Já os metacaracteres, ajudam o uso das expressões regulares. Uma vez
		// que essas expressões podem chegar a 30 caracteres. Por isso é
		// necessário uma facilidade no mecanismo de busca.
		// O mais fácil é \d - busca num texto todos os dígitos
		String regex2 = "\\d";
		String texto2 = "aba123aayiu1235as\rfa86556buiou5446ioababiuoy";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(texto2);
		System.out.println("Texto: " + texto2);
		// System.out.println("Índice: 123456789");
		System.out.println("Expressão: " + matcher2.pattern());
		System.out.println("Posições encontradas.");
		while (matcher2.find())
		{
			System.out.print(" " + matcher2.start() + " ");
		}
		// Para outras expressões regulares:
		// \D - Tudo aquilo que não é dígito.
		// \s - Espaços em brancos. Representados por \t \n \f \r
		// \S - Um caracter que não é em branco.
		// \w - caracteres e palavras. a-z, A-Z, dígitos e _
		// \W - tudo aquilo que não é palavra.
		//
		// Como procurar um range de palavras. Por exemplo, se quisermos
		// diferenciar a caixa, utilizaremos os [].
		// String regex3 = "[abc]"; // Qualquer uma das letras
		// String regex3 = "[a-zA-C]"; // de a a z minúsculo ou A a C maiúsculo.
		// String regex3 = "[a-z0-9]"; // de a a z minúsculo ou de 0 a 9
		// String regex3 = "[abcABC]"; // Qualquer uma das letras independente
		// da caixa
		//
		// No caso da busca de um número hexadecimal.
		int numero = 0x100F;
		// O padrão ocorre, uma vez:
		// - que ele começa com 0;
		// - depois x ou X
		// - depois números.
		// - Eles irão no máximo até letra F
		//
		// String regex3 = "0[xX][0-9a-fA-F]";
		// A expressão acima, é um início mas não definitiva.já que pega todo o
		// padrão. Para isso, precisamos de codificadores. Eles procuram por um
		// ou mais vez uma determinada ocorrência. Eles se dividem de quatro
		// formas.
		String regex3 = "0[xX][0-9a-fA-F]";
		String texto3 = "10456798 54657 0x15874 456 0xf 0xg 0xg";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(texto3);
		System.out.println("Texto: " + texto3);
		// System.out.println("Índice: 123456789");
		System.out.println("Expressão: " + matcher3.pattern());
		System.out.println("Posições encontradas.");
		while (matcher3.find())
		{
			// System.out.print(" " + matcher3.start() + " "); // somente a
			// posição
			System.out.println(matcher3.start() + " - " + matcher3.group() + " "); // agora
																					// para
			// pegarmos o
			// os valores.
		}
	}
}
