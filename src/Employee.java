

import lombok.*;

import java.time.LocalDate;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private long id;
    private String name;
    private String familyName;
    private String jobTitle;
    private LocalDate hiredate;
    private LocalDate birthday;
    private double salary;
    private Departement departement;
}
