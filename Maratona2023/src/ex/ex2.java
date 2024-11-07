package ex;

import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
	public static void main (String[] args) {
		int n;
		String num;
		Scanner scInt = new Scanner(System.in);
		Scanner scLine = new Scanner(System.in);
		//System.out.println("Digite quantidade de cartas no baralho:");
		n = scInt.nextInt();
		int [] Wanted = new int [n], Actual = new int [n];
		//System.out.println("Digite sequência:");
		num = scLine.nextLine();
		String [] nums = num.split(" ");
		for (int i = 0; i < n; i++) {
			Wanted[i] = Integer.parseInt(nums[i]);
			Actual[i] = i+1;
		}
		int p = embaralhar(Wanted, Actual, n);
		System.out.println(p);
	}
	public static int embaralhar(int [] Wanted, int [] Actual, int n) {
		int p = 0, control = 0;
		for (int i = 0; i < n; i++) {
			if(Wanted[i] != Actual[i]) {
				ArrayList<Integer> L = new ArrayList<Integer>();
				ArrayList<Integer> R = new ArrayList<Integer>();
				for(int j = 0; j < n; j++) {
					if(Actual[j] != Wanted[i] && control == 0) {
						L.add(Actual[j]);
					}
					else {
						R.add(Actual[j]);
						control = 1;
					}
				}
				for(int j = 0; j < n; j++) {
					if(R.isEmpty()) {
						Actual[j] = (int) (L.get(0));
						L.remove(0);
					}
					else if(L.isEmpty()) {
						Actual[j] = (int)(R.get(0));
						R.remove(0);
					}
					else {
						if((int)(R.get(0)) == Wanted[j]) {
							Actual[j] = (int)(R.get(0));
							R.remove(0);
						}
						else if((int)(L.get(0)) == Wanted[j]){
							Actual[j] = (int)(L.get(0));
							L.remove(0);
						}
						else {
							if(!L.isEmpty()) {
								Actual[j] = (int)(L.get(0));
								L.remove(0);
							}
							else {
								Actual[j] = (int)(R.get(0));
								R.remove(0);
							}
						}
					}
				}
				
				control = 0;
				p++;
			}
		}
		return p;
	}
}
