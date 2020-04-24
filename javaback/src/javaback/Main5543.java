package javaback;

import java.util.Scanner;
 
public class Main5543 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minbuger = 2001;
        int mindrink = 2001;
 
        for (int i = 0; i < 3; i++) {
            int buger = sc.nextInt();
            if (buger < minbuger) {
                minbuger = buger;
            }
        }
        for (int i = 0; i < 2; i++) {
            int drink = sc.nextInt();
            
 
            if (drink < mindrink) {
                mindrink = drink;
            }
        }
        int minset = minbuger + mindrink - 50;
        System.out.println(minset);
    }
 
}


//런타임에러 걸림....ㅎ  1번 결과 시도

/*package javaback; 

import java.util.Scanner;

public class Main5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] buger = new int [5];
		for(int i=0; i<buger.length; i++) {
			int num = sc.nextInt();
			if(num >=100 && num <= 2000) {
				buger[i] = num;
			} 
			else {
				num = sc.nextInt();
			}
		}
		sc.close();
		
		int minbuger = buger[0];
		for(int i=1; i<3; i++) {
			if(minbuger > buger[i])
				minbuger = buger[i];
		}
		
		int mindrink = buger[3];
		for(int i=3; i<buger.length; i++) {
			if(mindrink > buger[i])
				mindrink = buger[i];
		}
		
		int set = minbuger + mindrink - 50;
		System.out.println(set);
	}
} */
