package ek.beidel.oortcloudbot.model;

import ek.beidel.oortcloudbot.model.DifficultyLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Game {
    private long chatId;
    private int currentNumber;
    private int maxInitialNumber;
    private int maxMove;
    private DifficultyLevel difficulty;
    private boolean isUserTurn;
}
