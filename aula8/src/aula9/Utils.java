package aula9;

import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class Utils {
	public static boolean existe(List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	public static void ordena(List<Aluno>x) {
		Collections.sort(x);
	}
	public static Map<String, Aluno> retornaDados(Set conjuntoAlunos){
		Iterator x = conjuntoAlunos.iterator();
		Map <String, Aluno> y = new HashMap<String, Aluno>();
		while(x.hasNext()) {
			try {
			String [] a = ((String)x.next()).split("#");
			if (a[3].equals("R")) {
				y.put(a[0], new AlunoRegular(a[0]));
				((Aluno)y.get(a[0])).setNome(a[1]);
				((Aluno)y.get(a[0])).setNota(Double.parseDouble(a[2]));
			}
			else if (a[3].equals("E")) {
				y.put(a[0], new AlunoEspecial(a[0]));
				((Aluno)y.get(a[0])).setNome(a[1]);
				((Aluno)y.get(a[0])).setNota(Double.parseDouble(a[2]));
			}
			else throw new RuntimeException();
		}   catch(RuntimeException e) {
			System.out.println("RuntimeException!");
			}
		}
		return y;
	}
}
