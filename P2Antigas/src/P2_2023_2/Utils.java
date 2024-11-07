package P2_2023_2;

public class Utils {
	public static void verifica(String texto) throws TextoCurtoException{
		if(texto.length() < 10) {
			throw new TextoCurtoException(texto.length());
			}
	}
	public static String moderar(String texto) {
		String[] palavras = texto.split(" ");
		String moderada = "";
		for(String o: palavras) {
			if(Utilidades.getPalavroes().contains(o.toLowerCase())) {
				for(int i = 0; i < o.length(); i++) {
					moderada += "#";
				}
			}
			else {
				moderada += o;
			}
			moderada += " ";
		}
		return moderada.trim();
	}
}
