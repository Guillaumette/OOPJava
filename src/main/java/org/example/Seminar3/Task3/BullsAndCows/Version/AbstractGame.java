package org.example.Seminar3.Task3.BullsAndCows.Version;

import org.example.Seminar3.Task3.BullsAndCows.Answer;
import org.example.Seminar3.Task3.BullsAndCows.GameStatus;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int wordLength;
    protected int triesQty;
    protected String word;
    protected GameStatus status = GameStatus.INIT;

    public AbstractGame() {
    }

    public AbstractGame(int wordLength, int triesQty, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.triesQty = triesQty;
        this.word = word;
        this.status = status;
    }

    @Override
    public void start(int wordLength, int triesQty) {
        status = GameStatus.START;
        this.wordLength = wordLength;
        this.triesQty = triesQty;
        word = generateWord();
    }

    private String generateWord() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        List<String> strList = generateCharList();
        for (int i = 0; i < wordLength; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return sb.toString();
    }

    public abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        if (--triesQty == 0) {
            status = GameStatus.FINISH;
            return null;
        }
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)){
                bulls++;
            }
            if (word.contains(String.valueOf(value.charAt(i)))){
                cows++;
            }
        }
        if (bulls == wordLength) {
            status = GameStatus.WIN;
        }
        return new Answer(bulls, cows);
    }

    public String getWord() {
        return word;
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
}