/**
 * Utility class containing helpful methods to create different instances of games.
 * This class can be used to instantiate presets.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class GameFactory {

    /**
     * Creates a german game instance.
     *
     * @return A game instance.
     */
    public Game createGermanGame() {
        Configuration configuration = new Configuration("Spieler 1", "Spieler 2", "german");
        return new Game(configuration);
    }

    /**
     * Creates a german game instance.
     *
     * @return A game instance.
     */
    public Game createEnglishGame() {
        Configuration configuration = new Configuration("Player 1", "Player 2", "german");
        return new Game(configuration);
    }

    /**
     * Creates a {@link Game} instance based on a {@link Configuration} object.
     *
     * @param configuration The configuration object used to create the {@link Game} instance.
     * @return The newly created {@link Game} instance.
     */
    public Game createGame(Configuration configuration) {
        return new Game(configuration);
    }

}
