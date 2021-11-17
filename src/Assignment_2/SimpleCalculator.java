package Assignment_2;

import java.net.SocketOption;
import java.util.Scanner;

public class SimpleCalculator {

        public static void main(String[] args) {


            boolean flag=true;
            Double number1, number2, result;

            Scanner input = new Scanner(System.in);

            System.out.println("Simple Calculator");


            while (flag) {

                System.out.println("Press 1 to add\nPress 2 to subtract\nPress 3 to multiply \nPress 4 to divide\nPress 0 to Exit ");
                int choice= input.nextInt();

                if(choice==0)
                    break;
                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                switch (choice) {

                    // performs addition between numbers
                    case 1:
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    // performs subtraction between numbers
                    case 2:
                        result = number1 - number2;
                        System.out.println("The result is: "+number1 + " - " + number2 + " = " + result);
                        break;

                    // performs multiplication between numbers
                    case 3:
                        result = number1 * number2;
                        System.out.println("The result is: "+number1 + " * " + number2 + " = " + result);
                        break;

                    // performs division between numbers
                    case 4:
                        result = number1 / number2;
                        System.out.println("The result is: "+number1 + " / " + number2 + " = " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }
            }

        }
    }