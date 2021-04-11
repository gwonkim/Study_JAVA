package javaback;
import java.util.*;

public class Main1316 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); //단어 개수 
		String [] word = new String[num];
		char [] words;
		int check = 0;
		int answer = 0;

		for(int i=0; i<num; i++) {
			word[i] = s.next();
			words = word[i].toCharArray();
			for(int k=0; k<words.length; k++) {
				for(int j=k+1; j<words.length; j++) {
					if(words[k] == words[j] & words[k] != words[j-1]) {
						check = 1; //0 O 1 X
					}
				}
			}
			if(check == 0) {
				answer += 1; // 그룹단어 개수 
			}
			check = 0;
		}
		System.out.println(answer);
	}
}
