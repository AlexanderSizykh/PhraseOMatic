package com.orelly.PhraseOMatic;
import com.orelly.PhraseOMatic.config.PhraseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PhraseOMatic {
    private static final Logger logger = LoggerFactory.getLogger(PhraseOMatic.class);

    String phrase;

    @Autowired
    public PhraseData phraseData;

    @PostConstruct
    public void run() {
        generatePhrase(phraseData);
    }

    public String generatePhrase(PhraseData phraseData) {
        logger.info("Начинаем генерацию фразы");
        int oneLength = phraseData.getWordListOne().length;
        int twoLength = phraseData.getWordListTwo().length;
        int threeLength = phraseData.getWordListThree().length;

        logger.info("Рассчитано количество слов");

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        phrase = "Все что нам нужно это " + phraseData.getWordListOne()[rand1]
                + " "
                + phraseData.getWordListTwo()[rand2]
                + " "
                + phraseData.getWordListThree()[rand3];
        logger.info("Фраза сформирована");
        logger.info(phrase);

        return phrase;
    }
}
