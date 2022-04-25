package nl.novi.uitproberen3.controllers;

import nl.novi.uitproberen3.models.WordList;
import nl.novi.uitproberen3.services.WordListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// IN CASE: als ik geen 'public class WordList' doe maar gewoone een 'public class Word'
// @Get
// uitzoeken bij wordcontroller vraag ik dus al een 'lijst' op van alle woorden.
// Dit is in principe een woordenlijst!
// maar hoe zorg ik ervoor dat ik meerdere, unieke woordenlijsten kan krijgen?
// of moet ik het simppel houden en hier gewoon met 1 woordenlijst gaan werken...


@RestController
public class WordListController {
    private final WordListService service;

    public WordListController(WordListService service) {
        this.service = service;
    }

    @GetMapping(value = "/wordlists")
    public ResponseEntity<Object> getAllWordLists() {
        List<WordList> allWordLists = service.getAllWordLists();
        return new ResponseEntity<>(allWordLists, HttpStatus.OK);
    }

    @PostMapping(value = "/wordlists")
    public ResponseEntity<Object> createWordList(@Valid @RequestBody WordList wl, BindingResult br) {
        if (br.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fe : br.getFieldErrors()) {
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
        }
        else {
            service.createWordList(wl);
            return new ResponseEntity<>("Woordenlijst aangemaakt!", HttpStatus.CREATED);
        }
    }

}
