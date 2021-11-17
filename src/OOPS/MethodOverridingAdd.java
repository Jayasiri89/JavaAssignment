public class MethodOverridingAdd {

    public void Add(int a, int b)
    {
        System.out.println("Addition of " +a + "+" +b+ " is "+(a+b));
    }
}

class ChildMethod extends MethodOverridingAdd
{

    public void Add(String a, String b)
    {
        System.out.println("Concatenation of string " +a +" and "+ b+" is " +(a+b));
    }
}

class ApplicationMethodOverriding
{
    public static void main(String[] args) {

        MethodOverridingAdd method1 = new MethodOverridingAdd();
        method1.Add(2,3);

        ChildMethod method2 = new ChildMethod();
        method2.Add("hello", "world");

        MethodOverridingAdd method3 = new ChildMethod();
        method3.Add(3,4);
    }
}