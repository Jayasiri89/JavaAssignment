import com.sun.jdi.VMCannotBeModifiedException;

 class InheritenceHouse {

   int lightcount=0;
    InheritenceHouse()
    {
        this.lightcount=10;
    }

     public  void noOfLights()
    {
        System.out.println("Number of Lights in House is "+lightcount);
    }
}

class Room1 extends InheritenceHouse
{
    Room1(int noLights)
    {
        this.lightcount=noLights;
    }

   @Override
    public  void noOfLights()
    {
        System.out.println("Number of Lights in Room1 is "+lightcount);
    }

}

class Room2 extends InheritenceHouse
{
   Room2(int noLights)
    {
        this.lightcount=noLights;
    }

    @Override
    public  void noOfLights()
    {
        System.out.println("Number of Lights in Room2 is " + lightcount);
    }

}

class ApplicationHouse
{
    public static void main(String[] args) {

        InheritenceHouse house = new InheritenceHouse();
        house.noOfLights();
        InheritenceHouse r1 = new Room1(4);
        r1.noOfLights();
        Room2 r2 =new Room2(3);
        r2.noOfLights();
    }
}
