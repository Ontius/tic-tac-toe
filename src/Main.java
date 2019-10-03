/**
 * The main class of the game.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class Main {

    /**
     * This is the entry point of the game.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // This is the entry point of the game.

        // Sample code
        Configuration configuration = new Configuration("Patrick Egli", "Anderer Spieler");
        configuration.setLanguageName("german");
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.createGame(configuration);

        game.run();
        game.reserveField(game.getPlayerA(), 0, 0);
        game.run();
        game.reserveField(game.getPlayerB(), 1, 1);
        game.run();
    }

}
