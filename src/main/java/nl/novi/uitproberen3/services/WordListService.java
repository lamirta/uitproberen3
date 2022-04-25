package nl.novi.uitproberen3.services;


import nl.novi.uitproberen3.models.WordList;
import nl.novi.uitproberen3.repositories.WordListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordListService {

    @Autowired
    private WordListRepository wordListRepository;

    public List<WordList> getAllWordLists() {
        List<WordList> allWordLists = new ArrayList<>();
        wordListRepository.findAll() .forEach(allWordLists::add);
        return allWordLists;
    }

//    public List<WordList> getAllWordLists() {
//        List<WordList> allWordLists = new ArrayList<>(wordListRepository.findAll());
//        return allWordLists;
//    }

    public WordList createWordList(WordList wordList) {
        WordList ws = new WordList();
        ws.setTitle(wordList.getTitle());
        ws.setWord01(wordList.getWord01());
        ws.setWord02(wordList.getWord02());
        ws.setWord03(wordList.getWord03());
        ws.setWord04(wordList.getWord04());
        ws.setWord05(wordList.getWord05());
        ws.setWord06(wordList.getWord06());
        ws.setWord07(wordList.getWord07());
        ws.setWord08(wordList.getWord08());
        ws.setWord09(wordList.getWord09());
        ws.setWord10(wordList.getWord10());
        ws.setWord11(wordList.getWord11());
        ws.setWord12(wordList.getWord12());
        ws.setWord13(wordList.getWord13());
        ws.setWord14(wordList.getWord14());
        ws.setWord15(wordList.getWord15());
        ws.setWord16(wordList.getWord16());
        ws.setWord17(wordList.getWord17());
        ws.setWord18(wordList.getWord18());
        ws.setWord19(wordList.getWord19());
        ws.setWord20(wordList.getWord20());
        return wordListRepository.save(ws);
    }

}
