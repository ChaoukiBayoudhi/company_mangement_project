import lombok.*;

import java.util.ArrayList;
import java.util.Scanner;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor //generate a constructor with fields that are required(annotated with @NonNull)
//@Data
public class Departement {
    //attributes
    @EqualsAndHashCode.Include
    @NonNull //the name is required
    private String name;
    private String description;
    private ArrayList<Employee> lstEmployees=new ArrayList();

//    //2 constuctors (parameterized constructor and wiyhout parameters)
//    //surcharge of contructors
//
//    public Departement(String name, String description) {
//        this.name = name;
//        this.description = description;
//    }
//
//    public Departement() {
//        this.name = "";
//        this.description = "";
//    }
//    //getters, setters
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public ArrayList<Employee> getLstEmployees() {
//        return lstEmployees;
//    }
//
//    public void setLstEmployees(ArrayList<Employee> lstEmployees) {
//        this.lstEmployees = lstEmployees;
//    }

    public int findEmployee(long id) {
        Employee e=new Employee();
        e.setId(id);
        return lstEmployees.indexOf(e);
    }
    public boolean addEmployee(Employee e) {
        return  lstEmployees.add(e);
    }
    public void getDepartment(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the department name : ");
        name=sc.nextLine();
        System.out.print("Enter the department description : ");
        description=sc.nextLine();

    }
}
