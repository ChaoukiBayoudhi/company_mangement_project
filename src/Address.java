import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode //compare Address using all fields

public class Address {
    private int id;
    private int houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
