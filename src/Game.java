import java.util.ArrayList;
import java.util.List;

/**
 * Represents the whole game.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class Game {

    /**
     * The object instance of player A.
     */
    private Player playerA;

    /**
     * The object instance of player B.
     */
    private Player playerB;

    /**
     * The {@link Language} object instance.
     */
    private Language language;

    /**
     * The {@link GameField} object instance.
     */
    private GameField gameField;

    /**
     * The object instance of the {@link Renderer}.
     */
    private Renderer renderer;

    /**
     * The {@link GameLogic} object instance.
     */
    private GameLogic gameLogic;

    /**
     * Creates a {@link Game} instance based on the given {@link Configuration} instance.
     *
     * @param configuration The game configuration.
     */
    public Game(Configuration configuration) {
        playerA = new Player(configuration.getPlayerAName());
        playerB = new Player(configuration.getPlayerBName());
        language = new Language(configuration.getLanguageName());
        gameField = new GameField();
        renderer = new Renderer(this);
        gameLogic = new GameLogic(this);
    }

    /**
     * Runs the game.
     */
    public void run() {
        renderer.renderGame();

        Player winner = gameLogic.tryToFindWinner();

        if(winner != null) {
            System.out.println(language.getWinnerMessage(winner));
        } else if(gameLogic.isGameOver()) {
            System.out.println(language.getDrawMessage());
        }
    }

    /**
     * Returns the object instance of player A.
     *
     * @return The object instance of player A.
     */
    public Player getPlayerA() {
        return playerA;
    }

    /**
     * Returns the object instance of player B.
     *
     * @return The object instance of player B.
     */
    public Player getPlayerB() {
        return playerB;
    }

    /**
     * Returns the {@link Language} object instance.
     *
     * @return The {@link Language} object instance.
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Returns the {@link GameField} object instance.
     *
     * @return The {@link GameField} object instance.
     */
    public GameField getGameField() {
        return gameField;
    }

    /**
     * Reserves a specific field for the given {@code player}.
     *
     * @param player The {@link Player} object instance.
     * @param x The x-coordinate of the {@link FieldItem}.
     * @param y The y-coordinate of the {@link FieldItem}.
     */
    public void reserveField(Player player, int x, int y) {
        FieldItem fieldItem = gameField.getFieldItemAtPosition(x, y);

        if(fieldItem.getFieldOwner() != null) {
            System.out.println("The field at position '" + x + "," + y + "' is already reserved!");
            return;
        }

        fieldItem.setFieldOwner(player);
    }

}
