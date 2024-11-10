// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int hund = num/100;
		int tens = (num/10)%10;
		int ones = (num%100)%10;

		System.out.println(hund + " hundreds, " + tens + " tens, " + ones + " ones.");
	}
}
