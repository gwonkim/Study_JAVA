package javaStudy_backjoon;

import java.util.*;

public class Main10814 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int N = s.nextInt();
		String[][] array = new String[N][2];
		for(int i=0; i<N; i++) {
				array[i][0] = s.next();
				array[i][1] = s.next();
		}
		//추가적으로 공부할 것
		Arrays.sort(array, new Comparator<String[]>() {
			@Override
			public int compare(String[] one, String[] two) { 
				return Integer.compare(Integer.parseInt(one[0]), Integer.parseInt(two[0]));
			}
		});
		for(int i=0; i<N; i++) {
			System.out.println(array[i][0] + " "+array[i][1]);
		}
		s.close();
	}   
}