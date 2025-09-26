package patterns.singleton;

public class Game {
    public static void main(String[] args) {
        // Get singleton instance
        GameSession session1 = GameSession.getInstance();
        session1.startGame("Alice");
        session1.addScore(150);

        // Get same instance from elsewhere
        GameSession session2 = GameSession.getInstance();

        // Same object, same state
        System.out.println(session1 == session2); // true
        System.out.println(session2.getScore()); // 150
        System.out.println(session2.getLevel()); // 2

        // Modifying state through any reference affects the same object
        session2.addScore(50);
        System.out.println(session1.getScore()); // 200
    }
}
