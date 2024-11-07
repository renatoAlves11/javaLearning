package P2_2023_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Carro());
		carros.add(new Carro());
		carros.get(0).adicionaAcessorio(new Som("alto", 2300));
		carros.get(0).adicionaAcessorio(new VidroEletrico("eltrico", 400));
		carros.get(1).adicionaAcessorio(new Som("baixo", 1500));
		carros.get(1).adicionaAcessorio(new VidroEletrico("vidrao", 1200));
		carros.get(1).setPlaca("PLACAAA");
		Utils2.imprimirCusto(carros);
		Map mapa = Utils2.transformaListaEmMapa(carros);
		System.out.print(mapa);
	}
}
