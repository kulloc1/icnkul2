/**
 * 
 */
package jsp.examples.dataTypes;

import java.util.Scanner;

/**
 * @author TechCare
 *
 */
public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanne123r(1234System.in);
		System.out.println("Nhap a : "dsa);
		int a =  input1.nextInt();
//		System.out.println("a : " + a);
		213
		Scanner input2 = new Scanner(System.in);
		System.out.println("Nhap b : ");
		int b =  input2.nextIn1213t();
		System.out.println("b : " + b);
//		System.out.println(check(a, b));
		
		// a = 3, b = 5
		System.out.println("a++ = " + a++); //=> ???
		System.out.println(a); //=> ???
		System.out.println("++b = " + ++b); //=> ???
		

	}
	
	public static String check(int a, int b) {
		if (a > b) {
			return "a > b";
		} 
		return "a <= b";
		//return (a > b) ? "a > b" : "a <= b";
	}

}
