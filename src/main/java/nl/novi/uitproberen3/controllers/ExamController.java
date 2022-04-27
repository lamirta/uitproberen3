package nl.novi.uitproberen3.controllers;

import nl.novi.uitproberen3.dtos.ExamDto;
import nl.novi.uitproberen3.services.ExamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamController {
    private final ExamService service;

    public ExamController(ExamService service) {
        this.service = service;
    }

    // maar er is maar 1 soort examen eigenlijk..
    @GetMapping("/exams")
    public ResponseEntity<Object> getExams() {
        List<ExamDto> le = service.getExams();
        return new ResponseEntity<>(le, HttpStatus.OK);
    }

}
