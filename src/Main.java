import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Company c1=new Company();
        c1.setName("ABC company");
        c1.setPhoneNumber("+21622334455");
        c1.setEmail("abc@companies.tn");

        Departement d1=new Departement("HR", "Human Resources department",new ArrayList<Employee>());
        c1.addDepartment(d1);
        Departement d2=new Departement("SALES", "Sales department",new ArrayList<Employee>());
        Departement d3=new Departement("HR", "Human Resources department",new ArrayList<Employee>());

        c1.addDepartment(d2);
        //System.out.println(c1.findDepartment(d3));

        //c1.addDepartment(d3);

       // System.out.println(d1.equals(d1));
        //System.out.println(d1.equals(d3));
*/

        Address a1=new Address();
        a1.setId(1);
        a1.setHouseNumber(11);
        a1.setCity("Tunis");
        a1.setCountry("Tunisia");

        Address a2=new Address();
        a2.setId(2);
        a2.setHouseNumber(11);
        a2.setCity("Tunis");
        a2.setCountry("Tunisia");

        //compare a1 and a2 using equals
        if(a1.equals(a2))
            System.out.println("The same address");
        else
            System.out.println("different addresses");

        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);

    }
}