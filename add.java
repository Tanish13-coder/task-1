package v;
import java.util.*;
public class add {

	public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
      
      System.out.println("enter the number 1");
      int num1=Sc.nextInt();
      
      System.out.println("enter the number  2");
      int num2=Sc.nextInt();
      
      int num3=num1 + num2;
      int num4=num1 - num2;
      int num5=num1*num2;
      
      System.out.println("the addition of number is " +num3);
      System.out.println("the substraction of number is " +num4);
      System.out.println("the multiplication of number is " +num5);
      if (num2 != 0) {
          float num6 =(float) num1 / num2;
          System.out.println("The division of numbers is: " + num6);
      } else {
          System.out.println("Division by zero is not possible.");
      }

	}

}
