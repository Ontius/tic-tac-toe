import java.util.List;

/**
 * Renders the current state of a game instance.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class Renderer {

    /**
     * The {@link Game} object instance.
     */
    private Game game;

    /**
     * This constructor creates a {@link Renderer} instance with the given {@code game} instance.
     *
     * @param game The game object instance.
     */
    public Renderer(Game game) {
        this.game = game;
    }

    public void renderGame() {
        GameField gameField = game.getGameField();
        List<FieldItem> fieldItems = gameField.getFieldItems();
        int width = gameField.getFieldWidth();
        int line = 0;

        System.out.println("-------");

        for(int i = 0; i < fieldItems.size(); i++) {
            FieldItem fieldItem = fieldItems.get(i);
            int currentLine = i / width;
            boolean isLastColumn = ((i + 1) % width) == 0;

            if(currentLine > line) {
                line = currentLine;
                System.out.println();
            }

            System.out.print("|");
            System.out.print(getFieldSymbol(fieldItem));

            if(isLastColumn) {
                System.out.print("|");
            }
        }

        System.out.println("\n-------");
    }

    /**
     * Returns the symbol for a specific field.
     *
     * @param fieldItem The {@link FieldItem} object instance.
     * @return The symbol for the field.
     */
    private String getFieldSymbol(FieldItem fieldItem) {
        Player fieldOwner = fieldItem.getFieldOwner();

        if(fieldOwner == game.getPlayerA()) {
            return "X";
        } else if(fieldOwner == game.getPlayerB()) {
            return "O";
        }

        return " ";
    }

}
