import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int companyMenu(){
        int choice;
        Scanner sc=new Scanner(System.in);

            System.out.println("1.add department");
            System.out.println("2.find department");
            System.out.println("3.Transfer employee to new department");
            System.out.println("4.Exit");
            do{
                System.out.print("Enter your choice : ");
                choice=sc.nextInt();
            }while(choice>0||choice<5);
            return choice;
    }
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


//        Address a1=new Address();
//        a1.setId(1);
//        a1.setHouseNumber(15);
//        a1.setStreetName("Flowers street");
//        a1.setZipCode("2000");
//        a1.setCity("Tunis");
//        a1.setCountry("Tunisia");
//
//        Address a2=new Address();
//        a2.setId(2);
//        a2.setHouseNumber(11);
//        a2.setStreetName("Flowers street");
//        a2.setZipCode("2000");
//        a2.setCity("Tunis");
//        a2.setCountry("Tunisia");
//
//
//        //compare a1 and a2 using equals
//        if(a1.equals(a2))
//            System.out.println("The same address");
//        else
//            System.out.println("different addresses");
//
//        System.out.println("a1 : " + a1);
//        System.out.println("a2 : " + a2);
//
//        Departement d1=new Departement("GRH");// using the RequiredArgsConstructor
//        System.out.println(d1);
//
         */
        int choice;
        do{
            choice=companyMenu();
            switch (choice){
                case 1:
                    break;
            }
        }while(choice!=4);

    }
}