/********
PrimeNumbers.java
Laura Josselin Hernandez Garcia
It shows the prime numbers between 1 and 100.
********/

import javax.swing.*;

public class PrimeNumbers {

	public static void main(String args[]) {
		int c;//contador
		int i;//numero
		int n;//contador
		i = 1;
		while (i<100) {
			n = 1;
			c = 0;
			while (n<=i) {
				if (i%n==0) {
					c = c+1;
				}
				n = n+1;
			}
			if (c==2) {
				JOptionPane.showMessageDialog(null, "Este numero es primo " + i);
			}
			i = i+1;
		}
	}


}
