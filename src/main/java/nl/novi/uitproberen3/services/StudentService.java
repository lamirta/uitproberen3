package nl.novi.uitproberen3.services;


import nl.novi.uitproberen3.dtos.StudentDto;
import nl.novi.uitproberen3.models.Student;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getStudents();
    public StudentDto getStudentByUsername(String username);
    public Student createStudent(StudentDto studentDto);

}
