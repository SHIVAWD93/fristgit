package Arrays;

import java.util.Scanner;

public class Palindromeprogram {
	int overloadmethod(int i) {
		return overloadmethod(i*=i);
	}

	public static void main(String[] args) {
		Palindromeprogram pn =new Palindromeprogram();
		
	System.out.println(pn.overloadmethod(100));
		
	}
	
	
	}


