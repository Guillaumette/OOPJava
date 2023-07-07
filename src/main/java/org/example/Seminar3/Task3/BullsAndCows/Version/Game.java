package org.example.Seminar3.Task3.BullsAndCows.Version;

import org.example.Seminar3.Task3.BullsAndCows.Answer;
import org.example.Seminar3.Task3.BullsAndCows.GameStatus;

public interface Game {
    void start(int wordLength, int triesQty);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
