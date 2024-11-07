package P2_2018_2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;

public class Utils {
	public static boolean existe(List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	public static void ordena(List x) {
		Collections.sort(x);
	}
	public Map<String, Aluno> retornaDados(Set conjuntoAlunos) throws RuntimeException{
		Iterator<String> x = conjuntoAlunos.iterator();
		Map<String, Aluno> mapa = new HashMap<String,Aluno>();
		while(x.hasNext()) {
			String atual = x.next();
			String [] array = atual.split("#");
			Aluno a;
			if(array[3].equals("E")) {
				a = new AlunoEspecial(array[0]);
				a.setNome(array[1]);
				a.setNota(Double.parseDouble(array[2]));
				mapa.put(array[0], a);
			}
			else if(array[3].equals("R")) {
				a = new AlunoRegular(array[0]);
				a.setNome(array[1]);
				a.setNota(Double.parseDouble(array[2]));
				mapa.put(array[0], a);
			}
			else throw new RuntimeException();
		}
		return mapa;
	}
}
