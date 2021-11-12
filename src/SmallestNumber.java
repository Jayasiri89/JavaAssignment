import java.util.Scanner;

//Program to find the smallest of 4 numbers
public class SmallestNumber {

    public static void main(String args[])
    {
        //variable declaration
        int n1,n2,n3,n4;

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Input 4 numbers");

        n1= sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();

        int small=0; //variable to hold the smallest among the given numbers

        // logic to find the smallest number
        if((n1<n2) && (n1<n3) &&(n1<n4))
            small=n1;
        else if((n2<n1) && (n2<n3) && (n2<n4))
            small=n2;
        else if((n3<n4)&& (n3<n4) && (n3<n1))
            small=n3;
        else small=n4;
        System.out.println("Smallest of 4 numbers is "+small);

    }
}
