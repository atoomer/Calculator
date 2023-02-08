import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        double firstNum = scan.nextDouble();
        System.out.print("Enter a second number: ");
        double secondNum = scan.nextDouble();

        System.out.println("\nWould you like to perform addition or subtraction?\n(type \"+\" for addition or \"-\" for subtraction)\n");
        String operation = scan.next();

        if(operation.equals("+"))
        {
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        }
        else if (operation.equals("-"))
        {
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
        }
        else
        {
            System.out.println("Invalid character");
        }
        
        scan.close();
    }
}