package P2_2022_1;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class SistemaPrincipal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String idBuscada = "cdjn";
		Set<String> x = LerArquivo.retornaStrings();
		CorpoCeleste buscado = new CorpoCeleste(idBuscada);
		try {
			Map<String, CorpoCeleste> mapa = Utils.retornaDados(x);
		if(Utils.existe(mapa.values(), buscado)) {
			System.out.println(mapa.get(idBuscada));
		}
		else {
			System.out.println("A estrela com ID " + idBuscada + " não existe");
		}
		} catch (FormatoIncorretoException e) {
			System.out.println(e);
		}
	}
}
