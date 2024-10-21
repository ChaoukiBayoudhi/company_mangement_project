import lombok.*;

@ToString(exclude = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
//@EqualsAndHashCode //compare Address using all fields
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//compare Address using only the fields annotated with @EqualsAndHashCode.Include
@EqualsAndHashCode(exclude = {"id", "country"})
//compare Address using all fields except id and country
public class Address {
    private int id;
    //@EqualsAndHashCode.Include
    private int houseNumber;
    //@EqualsAndHashCode.Include
    private String streetName;
    private String city;
    private String state;
    private String country;
   // @EqualsAndHashCode.Include
    private String zipCode;
}
