import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        double firstNum = scan.nextDouble();
        System.out.print("Enter a second number: ");
        double secondNum = scan.nextDouble();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        
    }
}