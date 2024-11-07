package P2_2018_2;

import java.util.ArrayList;

public class Principale {
	public static void main(String[] args) {
		ArrayList<Aluno> array = new ArrayList<Aluno>();
		array.add(new Aluno("678"));
		array.add(new Aluno("567"));
		array.add(new Aluno("124"));
		array.add(new Aluno("453"));
		array.get(0).setNome("Paulo");
		array.get(1).setNome("Marcio");
		array.get(2).setNome("Arthur");
		array.get(3).setNome("Yuri");
		Utils.ordena(array);
		System.out.println(array);
	}
}
