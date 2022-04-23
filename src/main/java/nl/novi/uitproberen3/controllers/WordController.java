package nl.novi.uitproberen3.controllers;

import nl.novi.uitproberen3.models.Student;
import nl.novi.uitproberen3.models.Word;
import nl.novi.uitproberen3.repositories.WordRepository;
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

@RestController
public class WordController {
    @Autowired
    WordRepository repository;

    // hier vraag je echter alle woorden op - niet woorden in een bepaalde woordenlijst
    @GetMapping("/words")
    public ResponseEntity<Object> getWords() {
        List<Word> lw = repository.findAll();
        return new ResponseEntity<>(lw, HttpStatus.OK);
    }

    @PostMapping("/words")
    public ResponseEntity<Object> createWord(@Valid @RequestBody Word w, BindingResult br) {
        if (br.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fe : br.getFieldErrors()) {
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
        }
        else {
            repository.save(w);
            return new ResponseEntity<>("Woord aangemaakt!", HttpStatus.CREATED);
        }
    }

}
