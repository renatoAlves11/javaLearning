package aula9;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Ex2 {
	public static void main (String[] args) {
		Map x = new HashMap();
		x.put("A1", 5.0);
		x.put("A2", 6.3);
		x.put("A3", 7.0);
		x.put("BD21", 3.0);
		x.put("B2", 7.6);
		x.put("AC74", 2.0);
		x.put("A5", 8.0);
		double soma = contaA(x);
		System.out.print(soma);
	}
	public static double contaA(Map mapa) {
		Iterator x = mapa.keySet().iterator();
		double soma = 0;
		while (x.hasNext()) {
			String a = (String)x.next();
			char[] A = (a).toCharArray();
			if(A[0] == 'A') {
				soma += (double)(mapa.get(a));
			}
		}
		return soma;
	}
}
