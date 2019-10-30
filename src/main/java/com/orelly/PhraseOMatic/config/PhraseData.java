package com.orelly.PhraseOMatic.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "word-lists")
public class PhraseData {
    private static final Logger logger = LoggerFactory.getLogger(PhraseData.class);


    private String[] wordListOne;
    private String[] wordListTwo;
    private String[] wordListThree;

    public void setWordListOne(String[] wordListOne) {
        this.wordListOne = wordListOne;
        logger.info("Забрали значение слов из группы 1" );
    }

    public void setWordListTwo(String[] wordListTwo) {
        this.wordListTwo = wordListTwo;
        logger.info("Забрали значение слов из группы 2" );

    }

    public void setWordListThree(String[] wordListThree) {
        this.wordListThree = wordListThree;
        logger.info("Забрали значение слов из группы 3" );

    }

    public String[] getWordListOne() {
        return wordListOne;
    }

    public String[] getWordListTwo() {
        return wordListTwo;
    }

    public String[] getWordListThree() {
        return wordListThree;
    }




}
