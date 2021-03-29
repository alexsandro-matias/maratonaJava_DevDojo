//Aula 128: Coleções pt 14 Map, HashMap e LinkedHashMap
//Aula 129: Coleções pt 14 Map, HashMap e LinkedHashMap

package br.com.abc.javacore.parte00_colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest
{
	public static void main(String[] args)
	{
		 Map<String, String> map = new HashMap<String, String>();
		// Como é um Hash, Não tem como garantir a ordem dos elementos.
		//
		//
		// Para manter a ordem de inserção devemos mudar o objeto declado.
//		Map<String, String> map = new LinkedHashMap<String, String>();
		//
		// Primeira regra de HashMap é que não pode haver chaves duplicadas.
		// Implementando um dicionário teremos como exemplo:
//		map.put("teklado", "teclado");
//		map.put("mause", "mouse");
//		map.put("vc", "você");
//		map.put("vc", "você??");
		System.out.println(map.get("teclado"));
//		System.out.println(map.get("paulo"));
		// substituição de valor
		// Para iterar os elementos do map temos duas possibilidade: Pela chave.
		// for (String key : map.keySet())
		// {
		// System.out.println(key);
		// }
		//
		// // Ou pelo valor
		//
		// for (String valores : map.values())
		// {
		// System.out.println(valores);
		// }
		//
		// Para fazer ambos campos é necessária a chamada de uma interface
		// chamanda Entry que é bem mais completa
		for (Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
