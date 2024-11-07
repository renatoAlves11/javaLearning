package ex1;

import java.util.List;
import java.util.ArrayList;

public class Utils {
	public static boolean existe(List x, Funcionario y) {
		return x.contains(y);
	}
	public static List retornaDados(String[] array_funcionarios) {
		List x = new ArrayList();
		for(int i = 0; i < array_funcionarios.length; i++) {
			String [] array = array_funcionarios[i].split("#");
			if(array[3].equals("P")) {
				x.add(new Programador(array[0]));
				((Programador)(x.get(i))).setNome(array[1]);
				((Programador)(x.get(i))).setSalario(Double.parseDouble(array[2]));
			}
			if(array[3].equals("A")) {
				x.add(new AnalistaSistemas(array[0]));
				((AnalistaSistemas)(x.get(i))).setNome(array[1]);
				((AnalistaSistemas)(x.get(i))).setSalario(Double.parseDouble(array[2]));
			}
		}
		return x;
	}
	public static void mediaFuncs(List x) {
		int progs = 0, anals = 0;
		double progsSal = 0, analsSal = 0;
		for(Object y : x) {
			if(y instanceof Programador) {
				progs++;
				progsSal += ((Programador)y).getSalario();
			}
			if(y instanceof AnalistaSistemas) {
				anals++;
				analsSal += ((AnalistaSistemas)y).getSalario();
			}
		}
		System.out.println(progsSal/progs);
		System.out.println(analsSal/anals);
	}
}
