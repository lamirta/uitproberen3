package nl.novi.uitproberen3.dtos;

// als je Lombok gebruik moet je wel alle velden final maken.
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class StudentDto {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String school;

}
