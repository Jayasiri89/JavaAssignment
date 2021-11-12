import java.net.SocketOption;
import java.util.Scanner;
//P
public class DayNumberofWeek {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter a number");
        int a= sc.nextInt();

        int day=a % 7;

        switch(day)
        {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                 System.out.print("Wednesday");
                 break;
            case 4:
                 System.out.print("Thursday");
                 break;
            case 5:
                 System.out.print("Friday");
                 break;
            case 6:
                 System.out.print("Saturday");
                 break;
            default:
                 System.out.println("Not a valid number");
        }
    }
}
