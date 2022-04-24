package nl.novi.uitproberen3.services;

import nl.novi.uitproberen3.dtos.StudentDto;
import nl.novi.uitproberen3.models.Student;
import nl.novi.uitproberen3.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    // twee manieren om de repository hier te krijgen.
    // #1: (via annotation)
//    @Autowired
//    StudentRepository studentRepository;

    // #2: (via constructor)
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    // hier maakt hij bovenaan boven automatisch een field aan die 'final' is. Die repos is dus altijd hetzelfde, which is good.


//    // dit is eigenlijk niet netjes, want we willen juist dtos meegeven door het systeem, niet de entiteit.
//    @Override
//    public List<Student> getStudents() {
////        return this.studentRepository.findAll();
//        return studentRepository.findAll();
//    }

    @Override
    public List<StudentDto> getStudents() {
        List<Student> ls = this.studentRepository.findAll();
        List<StudentDto> students = new ArrayList<>();

        for (Student s : ls) {
            StudentDto sdto = new StudentDto(s.getId(), s.getUsername(), s.getPassword(), s.getEmail(), s.getFirstName(), s.getLastName(), s.getAge(), s.getSchool());
            students.add(sdto);
        }
        return students;
    }


    @Override
    public Student createStudent(StudentDto studentDto) {
        Student s = new Student();
        s.setUsername(studentDto.getUsername());
        s.setPassword(studentDto.getPassword());
        s.setEmail(studentDto.getEmail());
        s.setFirstName(studentDto.getFirstName());
        s.setLastName(studentDto.getLastName());
        s.setAge(studentDto.getAge());
        s.setSchool(studentDto.getSchool());
        return studentRepository.save(s);
//        return studentRepository.save(StudentDto);
        // Normaal return je StudentDto, maar de .save() method verwacht een entitiet:
        // Hij kent hier die dto niet, want dat is geen entiteit. Dus maak je eerst die entitiet aan,
        // door al die velden van het dto object hier te kopieren en te declareren naar de entiteit..
        // s van Student entity is nu aangemaakt en vangt alles van dto op.
    }

    // check TechItEasy fifth, TelevisionServiceImpl om de juiste wijze van dto naar entiteit en andersom te schrijven:
    // transferToDto & tranferToEntiteit methodes..

}
