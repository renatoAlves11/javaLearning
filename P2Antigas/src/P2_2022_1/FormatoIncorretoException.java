package P2_2022_1;

public class FormatoIncorretoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FormatoIncorretoException(){
	}
	public FormatoIncorretoException(String str) {
		System.out.println("O formato da String " + str + " está incorreto ");
	}
}
