package Patterm;

import java.util.Scanner;

public class Primmme {
	public static void main(String[] args) {
		int num=3;
		int cou=0;
		for (int i = 2; i <num; i++) {
			if(num%2==0) {
				cou++;
				break;
			}
			
		}if(cou==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime");
		}
		
	
		
	}

}
