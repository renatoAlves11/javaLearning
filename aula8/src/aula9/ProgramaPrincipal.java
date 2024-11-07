package aula9;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;

public class ProgramaPrincipal {
	public static void main (String [] args) {
		Set x = new HashSet();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			x.add(sc.nextLine());
		}
		Map<String, Aluno> y = Utils.retornaDados(x);
		Iterator z = y.keySet().iterator();
		List a = new ArrayList();
	while(z.hasNext()) {
		a.add(y.get(z.next()));
		}
		Utils.ordena(a);
		for(Object i : a) {
			System.out.println((Aluno)i);
		}
	}
}
