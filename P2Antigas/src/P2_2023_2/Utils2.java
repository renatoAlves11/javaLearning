package P2_2023_2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Utils2 {
	public static void imprimirCusto(List<Carro>carros) {
		for(Carro x : carros) {
			double totalPreco = 0, totalImpostos = 0;
			List<Acessorio> acessorios = x.getAcessorio();
			for(Acessorio a : acessorios) {
				totalPreco += a.getPreco();
				totalImpostos += a.calcularImposto();
			}
			System.out.println("Total Preços: " + totalPreco + " Total Impostos" + totalImpostos);
		}
	}
	public static Map<String, Carro> transformaListaEmMapa(List<Carro> carros) {
		Iterator<Carro> x = carros.iterator();
		Map<String, Carro> mapa = new HashMap<String, Carro>();
		while(x.hasNext()) {
			Carro carro = x.next();
			mapa.put(carro.getPlaca(), carro);
		}
		return mapa;
	}
}
