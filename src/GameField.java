import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents the game field. Contains the whole state of the game.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class GameField {

    /**
     * The list of {@link FieldItem} instances.
     */
    private List<FieldItem> fieldItems;

    /**
     * The default constructor.
     */
    public GameField() {
        setupFieldItems();
    }

    /**
     * Returns the list of {@link FieldItem} object instances.
     *
     * @return The list of {@link FieldItem} object instances.
     */
    public List<FieldItem> getFieldItems() {
        return fieldItems;
    }

    /**
     * Returns a {@link FieldItem} at a specific index.
     *
     * @param index The index of the {@link FieldItem}.
     * @return The {@link FieldItem} object instance.
     */
    public FieldItem getFieldItemAtIndex(int index) {
        if(index < 0 || index > (fieldItems.size() - 1)) {
            System.out.println("The index: '" + index + "' is out of bounds.");
            return null;
        }

        return fieldItems.get(index);
    }

    /**
     * Returns a {@link FieldItem} at a specific position.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return The {@link FieldItem} object instance at the given position.
     */
    public FieldItem getFieldItemAtPosition(int x, int y) {
        int index = calculateListIndex(x, y);
        return getFieldItemAtIndex(index);
    }

    /**
     * Returns the width of the game field.
     *
     * @return The width of the game field.
     */
    public int getFieldWidth() {
        return 3;
    }

    /**
     * Returns the height of the game field.
     *
     * @return The height of the game field.
     */
    public int getFieldHeight() {
        return 3;
    }

    /**
     * Checks if the game field is full.
     *
     * @return A boolean state containing information of whether the game field is full or not.
     */
    public boolean isGameFieldFull() {
        for(FieldItem fieldItem : getFieldItems()) {
            if(fieldItem.getFieldOwner() == null) {
                return false;
            }
        }

        return true;
    }

    /**
     * Calculates the list index with the given {@code x} and {@code y} coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return The calculated list index.
     */
    public int calculateListIndex(int x, int y) {
        return (y * getFieldWidth()) + x;
    }

    /**
     * Sets up the list of {@link FieldItem} instances.
     */
    private void setupFieldItems() {
        fieldItems = new ArrayList<>();
        int width = getFieldWidth();
        int height = getFieldHeight();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                fieldItems.add(new FieldItem());
                // int index = (y * width) + x;
            }
        }
    }

}
