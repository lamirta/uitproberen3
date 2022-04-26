package nl.novi.uitproberen3.services;


import nl.novi.uitproberen3.models.WordList;
import nl.novi.uitproberen3.repositories.WordListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordListService {

    @Autowired
    private WordListRepository wordListRepository;

    // wel omzetten naar dto
    public List<WordList> getAllWordLists() {
        return wordListRepository.findAll();
    }

//    public List<WordList> getAllWordLists() {
//        List<WordList> allWordLists = new ArrayList<>(wordListRepository.findAll());
//        return allWordLists;
//    }

    public WordList createWordList(WordList wordList) {
        WordList ws = new WordList();
        ws.setTitle(wordList.getTitle());
        ws.setWords(wordList.getWords());
        return wordListRepository.save(ws);
    }

}
