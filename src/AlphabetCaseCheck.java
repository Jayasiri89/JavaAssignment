//program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )
import java.util.Scanner;

public class AlphabetCaseCheck {

    public static void main(String[] args)
    {
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println('A');

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch +" is an UpperCase character");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch +" is an LowerCase character" );
        else
            System.out.println("\n" + ch + " is not an aplhabetic character" );
}
}
