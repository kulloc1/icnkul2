/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class example4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inpu123t = new Scanner(System.in);
		System.out.println("Nhap so123 : ");
		int a =  input.nextInt();
		System.out.prin123tln("so213 ban input123 : " + a);
		System.out.println(print(a))eqw;

	}
	
	public static String print(int a) {
		String output = "";
		switch (a) {
		case 1:
			output = "create2134 employee";
			break;
		case 2:
			output = "show the existing employee";
			break;
		case 3:
			output = "exit";
			break;
		default:
			output =  "Invalid value";
			break;
		}
		return output;
	}

}
