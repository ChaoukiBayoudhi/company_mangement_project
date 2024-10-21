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
    private boolean findDepartment(String name){
        int i=0;
        boolean found=false;
//        while(i<departements.size() && !found)
//        {
//            if(departements.get(i).getName().equals(name))
//                found=true;
//            i++;
//        }
        while(i<departements.size() && !found)
        {
            found=departements.get(i).getName().equals(name);
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
}
