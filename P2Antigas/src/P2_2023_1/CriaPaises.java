package P2_2023_1;

import java.util.ArrayList;
import java.util.Collections;

public class CriaPaises {
	public static ArrayList<Pais> retornaPaises(){
		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises.add(new Pais("can", "Canada", 2300.9));
		paises.add(new Pais("Eua", "Estados Unidos", 10000.8));
		paises.add(new Pais("MeX", "Mexico", 3458.9));
		paises.get(0).atribuiFronteiras(paises.get(1));
		paises.get(1).atribuiFronteiras(paises.get(0));
		paises.get(1).atribuiFronteiras(paises.get(2));
		paises.get(2).atribuiFronteiras(paises.get(1));
		paises.get(0).setPopulacao(23000);
		paises.get(1).setPopulacao(3621789);
		paises.get(2).setPopulacao(76453);
		return paises;
	}
	public static ArrayList<Pais> retornaPaises(String[] array){
		ArrayList<Pais> paises = new ArrayList<Pais>();
		for(int i = 0; i < array.length; i++) {
			
			int qtdHashtag = 0;
			char[] arrayChar = array[i].toCharArray();
			for(int j = 0; j < arrayChar.length; j++) {
				if(arrayChar[j] == '#') {
					qtdHashtag++;
				}
			}
			try {
			if(qtdHashtag != 3) {
				throw new FormatoIncorretoException(qtdHashtag, array[i]);
			}
			} catch(FormatoIncorretoException e) {
				System.out.println(e);
				continue;
			}
			String [] temp = array[i].split("#");
			Pais o = new Pais(temp[0], temp[1], Double.parseDouble(temp[2]));
			paises.add(o);
			paises.get(paises.indexOf(o)).setPopulacao(Double.parseDouble(temp[3]));
		}
		return paises;
	}
}
