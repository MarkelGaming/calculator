import java.util.Scanner;
public class Calculator {
	
	

	public static void main(String[] args) {
		      int num1;
		      int num2;
		      int ans;
		      char op;
		      Scanner scan = new Scanner(System.in);
		      System.out.print("Please word your the equation : ");
		      num1 = scan.nextInt();
		      op = scan.next().charAt(0);
		      num2 = scan.nextInt();
		      switch(op) {
		         case '+': ans = num1 + num2;
		            break;
		         case '-': ans = num1 - num2;
		            break;
		         case '*': ans = num1 * num2;
		            break;
		         case '/': ans = num1 / num2;
		            break;
		         default:  System.out.printf("Error! Enter correct operator");
		            return;
		      }
		      System.out.print("\nThe result is your the equation :");
		      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}
}
