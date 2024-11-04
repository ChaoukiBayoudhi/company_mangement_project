import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int companyMenu(){
        int choice;
        Scanner sc=new Scanner(System.in);

            System.out.println("1.add department");
            System.out.println("2.find department");
            System.out.println("3.Transfer employee to new department");
            System.out.println("4. Add employee");
            System.out.println("5.Exit");
            do{
                System.out.print("Enter your choice : ");
                choice=sc.nextInt();
            }while(choice<0||choice>5);
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
        Company company = new Company();
        company.setName("Company 1");
        company.setEmail("company1@companies.tn");
        company.setAddress(new Address(1,7,"street of happiness","Tunis","Tunis","Tunisia","2000"));
        //...
        int choice;
        Departement d1=new Departement();
        Scanner sc = new Scanner(System.in);
        do{
            choice=companyMenu();
            switch (choice){
                case 1:
                    //add department
                    d1.getDepartment();
                    company.addDepartment(d1);
                    break;
                case 2:
                    System.out.println("Enter the name of the department :");
                    String name=sc.nextLine();
                    Departement d2=new Departement();
                    d2.setName(name);
                    boolean result=company.findDepartment(d2);
                    if(result)
                        System.out.println("The department is found.");
                    else
                        System.out.println("The department is not found.");
                    break;
                case 3:
                    //transfer employee from department to another one
                    System.out.println("id of the employee ?");
                    long idEmp=sc.nextLong();
                    System.out.println("Enter the name of the new department");
                    String nameDep=sc.nextLine();
                    result=company.transferEmployee(idEmp,nameDep);
                    if(result)
                        System.out.println("Successfully transferred");
                    else
                        System.out.println("Failed to transfer the employee");
                    break;
                case 4:
                    //add employee
                    Employee employee = new Employee();
                    employee.getEmployee();
                    System.out.println("Enter the name of the department");
                    nameDep=sc.nextLine();
                    Departement dept=company.findDepartment(nameDep);
                    if( dept != null) {
                        dept.addEmployee(employee);
                        System.out.println("Employee was added successfully");
                    }
                    else {
                        System.out.println("Department not found.");
                    }
                    break;

            }
        }while(choice!=5);

    }
}