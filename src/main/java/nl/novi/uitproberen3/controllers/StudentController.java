package nl.novi.uitproberen3.controllers;

import nl.novi.uitproberen3.dtos.StudentDto;
import nl.novi.uitproberen3.models.Student;
import nl.novi.uitproberen3.repositories.StudentRepository;
import nl.novi.uitproberen3.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

//    // niet meer rechtstreeks repo, maar via service laag
//    @Autowired
//    StudentRepository repository;

@RestController
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public ResponseEntity<Object> getStudents() {
        List<StudentDto> ls = service.getStudents();
        return new ResponseEntity<>(ls, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@Valid @RequestBody StudentDto sdto, BindingResult br) {
        if (br.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fe : br.getFieldErrors()) {
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
        }
        else {
            service.createStudent(sdto);
            return new ResponseEntity<>("Leerling aangemaakt!", HttpStatus.CREATED);
        }
    }

}
