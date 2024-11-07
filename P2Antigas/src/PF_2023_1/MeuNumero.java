package PF_2023_1;

public class MeuNumero {
	public static double media(String string) throws NumeroNegativoException{
		String [] array = string.split("#");
		double soma = 0;
		for(String a : array) {
			double num = Double.parseDouble(a);
			if(num < 0) {
				throw new NumeroNegativoException(num);
			}
			else {
				soma += num;
			}
		}
		return soma/array.length;
	}
}
