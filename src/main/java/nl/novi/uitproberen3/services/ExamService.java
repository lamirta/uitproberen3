package nl.novi.uitproberen3.services;

import nl.novi.uitproberen3.dtos.ExamDto;
import nl.novi.uitproberen3.models.Exam;
import nl.novi.uitproberen3.repositories.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamService {
    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public List<ExamDto> getExams() {
        List<Exam> el = this.examRepository.findAll();
        List<ExamDto> exams = new ArrayList<>();

//        for (Exam e : el) {
//            ExamDto edto = new ExamDto(e.getId(), e.getUserInput());
//            exams.add(edto);
//        }
        return exams;
    }

}
