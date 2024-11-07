package P2_2022_1;

import java.util.Scanner;

public class StringUtils {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = processa(str);
		System.out.println(str);
		str = inverte(str);
		System.out.println(str);
	}
	public static String processa(String str) {
		String nova = str.toUpperCase();
		nova = nova.replaceAll("A", "4");
		nova = nova.replaceAll("E", "3");
		nova = nova.replaceAll("I", "1");
		nova = nova.replaceAll("O", "0");
		return nova;
	}
	public static String inverte(String str) {
		char[] array = str.toCharArray();
		String nova = "";
		for(int i = array.length-1; i >= 0; i--) {
			nova += array[i];
		}
		return nova;
	}
}
