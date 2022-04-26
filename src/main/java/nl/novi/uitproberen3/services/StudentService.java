package nl.novi.uitproberen3.services;


import nl.novi.uitproberen3.dtos.StudentDto;
import nl.novi.uitproberen3.models.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getStudents();
    StudentDto getStudentByUsername(String username);
    Student createStudent(StudentDto studentDto);

}
