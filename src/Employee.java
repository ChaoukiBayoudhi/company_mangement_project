

import lombok.*;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Employee {
    @EqualsAndHashCode.Include
    private long id;
    private static long lastId=0;
    private String name;
    private String familyName;
    private String jobTitle;
    private LocalDate hiredate;
    private LocalDate birthday;
    private double salary;
    //nested field
    private Departement departement;
    public Employee() {
        id=++lastId;
    }

    public Employee(String name, String familyName, String jobTitle, LocalDate hiredate, LocalDate birthday, double salary, Departement departement) {
        this.id = ++lastId;
        this.name = name;
        this.familyName = familyName;
        this.jobTitle = jobTitle;
        this.hiredate = hiredate;
        this.birthday = birthday;
        this.salary = salary;
        this.departement = departement;
    }

    public void getEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee name : ");
        name=sc.nextLine();
        System.out.print("Enter the employee family name : ");
        familyName=sc.nextLine();
        System.out.print("Enter the employee job title : ");
        jobTitle=sc.nextLine();
        //get the hiredate (LocalDate)
        DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the employee hiredate (yyyy-MM-dd) : ");
        String date1=sc.nextLine();
        hiredate=LocalDate.parse(date1,format);
        System.out.println("Enter the employee salary");
        salary=sc.nextDouble();
    }
}
