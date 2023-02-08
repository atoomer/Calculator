import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        double firstNum = scan.nextDouble();
        System.out.print("Enter a second number: ");
        double secondNum = scan.nextDouble();

        System.out.println("\nEnter the symbol for the operation you would like to perform: \n+ (add), - (minus), * (multiply), / (divide)\n");
        String operation = scan.next();

        if(operation.equals("+"))
        {
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        }
        else if (operation.equals("-"))
        {
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
        }
        else if (operation.equals("*"))
        {
            System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
        }
        else if (operation.equals("/"))
        {
            System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
        }
        else
        {
            System.out.println("Invalid character");
        }
        
        scan.close();
    }
}