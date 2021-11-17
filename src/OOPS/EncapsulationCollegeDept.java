package OOPS;

public class EncapsulationCollegeDept {

    private String college_name;
    private String department;

    public void setCollege_Name(String name)
    {
        college_name=name;
    }

    public String getCollege_Name()
    {
        return college_name;
    }

    public void setDepartment(String dept)
    {
        department=dept;
    }

    public String getDepartment()
    {
        return department;
    }
}

class ApplicationCollege
{
    public static void main(String[] args) {

        EncapsulationCollegeDept college = new EncapsulationCollegeDept();

        college.setCollege_Name("BMSCE");
        college.setDepartment("CSE");

        System.out.println("First College name is " + college.getCollege_Name());
        System.out.println("Department is "+ college.getDepartment());

        college.setCollege_Name("RVCE");
        college.setDepartment("ECE");

        System.out.println("Second College name is " + college.getCollege_Name());
        System.out.println("Department is "+ college.getDepartment());

        college.setCollege_Name("JSSATE");
        college.setDepartment("MECH");

        System.out.println("Third College name is " + college.getCollege_Name());
        System.out.println("Department is "+ college.getDepartment());


    }
}
