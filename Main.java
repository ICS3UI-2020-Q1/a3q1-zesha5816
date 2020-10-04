import java.util.Scanner;
/**
 *  a program that will find the maximum integer between three numbers that the user inputs.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
	//prompts user for the three integer
	System.out.println("Please enter three integers on separate lines");
	//gets the input from user on seperate line
	int num1 = input.nextInt();
	int num2 = input.nextInt();
  int num3 = input.nextInt();  
	//calculates the biggest number and prints it respectly
	if(num2 < num1 && num1 > num3){
		System.out.println("Maximum: " + num1);
	}else if (num1 < num2 && num2 > num3){
		System.out.println("Maximum: " + num2);
	}else{
		System.out.println("Maximum: " + num3);
	}
  }
}
