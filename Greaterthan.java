package v;
import java.util.*;
public class Greaterthan {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in) ;
		System.out.println("enter a first number");
		int num1=Sc.nextInt();
		System.out.println("enter a second number");
		int num2=Sc.nextInt();
		
		if(num1<num2) {
			System.out.println(num1+ " less than number2" +num2 );
		}
		else if (num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else
			System.out.println(num1+" is equal to "+num2);
		

	}

}
