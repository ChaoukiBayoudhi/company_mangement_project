import lombok.*;

import java.util.ArrayList;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Company {
    private String name;
    private Address address;
    private String phoneNumber;
    private String email;
    private String website;
    private ArrayList<Departement> departements=new ArrayList();
    //Version 1
    private Departement findDepartment(String name){
        int i=0;
        Departement found=null;
//        while(i<departements.size() && !found)
//        {
//            if(departements.get(i).getName().equals(name))
//                found=true;
//            i++;
//        }
        while(i<departements.size() && found!=null)
        {
            if(departements.get(i).getName().equalsIgnoreCase(name))
                found=departements.get(i);
            i++;
        }
        return found;
    }

    //Version 2
    public boolean findDepartment(Departement dep) {
        return departements.contains(dep);
    }

        public boolean addDepartment(Departement dep) {
            return departements.add(dep);
        }

     public Employee  findEmployee(int id){
         int i=0;
         Employee foundedEmp=null;

         while(i<departements.size() && foundedEmp!=null){//loop through  departments
             int j=0;
             while(j<departements.get(i).getLstEmployees().size() && foundedEmp!=null){
                 if(departements.get(i).getLstEmployees().get(j).getId()==id){
                     foundedEmp=departements.get(i).getLstEmployees().get(j);
                 }
                 else
                     j++;
             }
             i++;
         }
         return foundedEmp;
    }
    public Employee  findEmployee_v2(int id){
        int i=0;
        Employee foundedEmp=null;

        while(i<departements.size() && foundedEmp!=null){//loop through  departments

            int j=departements.get(i).findEmployee(id);
            if(j!=-1)
                    foundedEmp=departements.get(i).getLstEmployees().get(j);

            i++;
        }
        return foundedEmp;
    }

    public  boolean transferEmployee(int employeeId, String newDeptName){
        Employee employee=findEmployee_v2(employeeId);

    }

    public  boolean transferEmployee(Employee employee, Departement department){

    }
}
