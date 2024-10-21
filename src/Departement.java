import lombok.*;

import java.util.ArrayList;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Departement {
    //attributes
    @EqualsAndHashCode.Include
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
}
