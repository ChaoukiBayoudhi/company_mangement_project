

import lombok.*;

import java.time.LocalDate;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Employee {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String familyName;
    private String jobTitle;
    private LocalDate hiredate;
    private LocalDate birthday;
    private double salary;
    //nested field
    private Departement departement;
}
