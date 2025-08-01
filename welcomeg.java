import java.util.Scanner;

public class Welcomeg{
  public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.printf("Enter your first name: ");
	  String firstName = scanner.nextLine();
	  
	  System.out.printf("Entar your last name: ");
	  String lastName = scanner.nextLine();
	  
	  System.out.println("Welcome to the second year" + firstName + lastName);
  }
}