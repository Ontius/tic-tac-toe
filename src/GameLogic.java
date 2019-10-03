import java.util.List;

/**
 * Contains the logic of the game.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class GameLogic {

    /**
     * The {@link Game} object instance.
     */
    private Game game;

    /**
     * This constructor creates a {@link GameLogic} object instance with
     * the given {@code game} object instance.
     */
    public GameLogic(Game game) {
        this.game = game;
    }

    /**
     * Checks if the game is over.
     *
     * @return A boolean state containing information of whether the game is over or not.
     */
    public boolean isGameOver() {
        Player winner = tryToFindWinner();
        return (game.getGameField().isGameFieldFull() && winner == null);
    }

    /**
     * Tries to find a winner.
     *
     * @return The {@link Player} object instance of the winner, if no winner was found, it returns null.
     */
    public Player tryToFindWinner() {
        GameField gameField = game.getGameField();
        int width = gameField.getFieldWidth();
        int height = gameField.getFieldHeight();

        // Check all columns (vertical line test).
        for(int i = 0; i < width; i++) {
            Player winner = getWinnerOnLine(i, 0, 0, 1);
            if(winner != null) return winner;
        }

        // Check all rows (horizontal line test).
        for(int i = 0; i < height; i++) {
            Player winner = getWinnerOnLine(0, i, 1, 0);
            if(winner != null) return winner;
        }

        // Diagonal test (from left to right)
        Player winner = getWinnerOnLine(0, 0, 1, 1);
        if(winner != null) return winner;

        winner = getWinnerOnLine(width - 1, 0, -1, 1);
        if(winner != null) return winner;

        return null;
    }

    /**
     * Checks a specific line.
     *
     * @param startX The start x-coordinate.
     * @param startY The start y-coordinate.
     * @param directionX The x-direction.
     * @param directionY The y-direction.
     * @return If there is a winner, a {@link Player} object instance else null.
     */
    private Player getWinnerOnLine(int startX, int startY, int directionX, int directionY) {
        GameField gameField = game.getGameField();
        List<FieldItem> fieldItems = gameField.getFieldItems();
        int width = gameField.getFieldWidth();
        int startIndex = gameField.calculateListIndex(startX, startY);
        FieldItem startField = fieldItems.get(startIndex);

        if(startField.getFieldOwner() == null) {
            return null;
        }

        for(int i = 0; i < width; i++) {
            int x = startX + directionX * i;
            int y = startY + directionY * i;
            int index = gameField.calculateListIndex(x, y);
            FieldItem fieldItem = fieldItems.get(index);

            if(fieldItem.getFieldOwner() != startField.getFieldOwner()) {
                return null;
            }
        }

        return startField.getFieldOwner();
    }

}
