package P2_2022_1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class Utils {
	public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
		return x.contains(y);
	}
	public static void ordena(List<CorpoCeleste> a) {
		a.sort(null);
	}
	public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException{
		Iterator<String> x = conjuntoCorpos.iterator();
		Map<String, CorpoCeleste> mapa = new HashMap<String, CorpoCeleste>();
		while(x.hasNext()) {
			String atual = x.next();
			String [] strs = atual.split("#");
			if(strs.length != 4) {
				throw new FormatoIncorretoException(atual);
			}
			else {
				CorpoCeleste p;
				if(strs[3].equals("E")) {
					Estrela star = new Estrela(strs[0]);
					star.setNome(strs[1]);
					star.setDistancia(Double.parseDouble(strs[2]));
					mapa.put(strs[0], star);
				}
				if(strs[3].equals("P")) {
					Planeta planet = new Planeta(strs[0]);
					planet.setNome(strs[1]);
					planet.setDistancia(Double.parseDouble(strs[2]));
					mapa.put(strs[0], planet);
				}			
			}
		}
		return mapa;
	}
}
