package nl.novi.uitproberen3.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StudentDto {
    private final Long id;

    private final String username;
    private final String password;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String school;

}
