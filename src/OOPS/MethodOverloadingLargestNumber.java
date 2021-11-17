package OOPS;
import java.util.Scanner;

public class MethodOverloadingLargestNumber {

    int big;
    public void LargestNumber(int num1, int num2, int num3) {
        big = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Largest of 3 Numbers "+num1+ " " +num2+" and "+num3+" is "+big);


    }

    public void LargestNumber(int num1, int num2) {

         big = num1 > num2 ? num1 : num2;
        System.out.println("Largest of 2 numbers " +num1+" " +num2+ " is "+big);

        //return big;
    }
}

class ApplicationLargestNumber
{
    public static void main(String[] args) {

        MethodOverloadingLargestNumber objLarge = new MethodOverloadingLargestNumber();

        objLarge.LargestNumber(7,8);

        objLarge.LargestNumber(7,8,300);


    }
}
