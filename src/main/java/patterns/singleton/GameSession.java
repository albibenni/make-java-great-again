package patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class GameSession {
    private static GameSession instance;

    // State variables
    private String playerName;
    private int score;
    private int level;
    private List<String> achievements;
    private boolean isActive;

    private GameSession() {
        this.score = 0;
        this.level = 1;
        this.achievements = new ArrayList<>();
        this.isActive = false;
    }

    public static GameSession getInstance() {
        if (instance == null) {
            instance = new GameSession();
        }
        return instance;
    }

    // State management methods
    public void startGame(String playerName) {
        this.playerName = playerName;
        this.isActive = true;
        System.out.println("Game started for " + playerName);
    }

    public void addScore(int points) {
        this.score += points;
        if (score > level * 100) {
            levelUp();
        }
    }

    public void levelUp() {
        this.level++;
        achievements.add("Reached Level " + level);
    }

    public void endGame() {
        this.isActive = false;
        System.out.println("Game ended. Final score: " + score);
    }

    // Getters for state
    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getPlayerName() {
        return playerName;
    }
}
