package P2_2018_2;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class Nome {
	public static void main(String [] args) {
		Map a = new HashMap();
		a.put("A1", 5.0);
		a.put("A2", 6.3);
		a.put("A3", 7.0);
		a.put("B2", 7.6);
		a.put("AC74", 2.0);
		a.put("A5", 8.0);
		a.put("B3", 3.0);
		System.out.print(contaA(a));
	}
	public static double contaA(Map mapa) {
		Iterator<String> x = mapa.keySet().iterator();
		double soma = 0;
		while (x.hasNext()) {
			String atual = x.next();
			if(atual.startsWith("A")) {
				soma += (double)mapa.get(atual);
			}
		}
		return soma;
	}
}
