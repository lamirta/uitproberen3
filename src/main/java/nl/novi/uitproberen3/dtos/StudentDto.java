package nl.novi.uitproberen3.dtos;

// als je Lombok gebruik moet je wel alle velden final maken.
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Data
public class StudentDto {

    @Id
    @GeneratedValue
    private final Long id;

    @UniqueElements
    private final String username;
    private final String password;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String school;

}
