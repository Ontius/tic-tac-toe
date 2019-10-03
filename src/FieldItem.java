/**
 * Represents the a individual field item. It contains the state of a single field item.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class FieldItem {

    /**
     * The owner of the {@link FieldItem}.
     */
    private Player fieldOwner;

    /**
     * This constructor creates a {@link FieldItem} instance without a field owner.
     */
    public FieldItem() {
        this(null);
    }

    /**
     * This constructor creates a {@link FieldItem} instance with the given {@code fieldOwner}.
     *
     * @param fieldOwner The owner of the field that is being set.
     */
    public FieldItem(Player fieldOwner) {
        this.fieldOwner = fieldOwner;
    }

    /**
     * Returns the field owner object instance.
     *
     * @return The field owner object instance.
     */
    public Player getFieldOwner() {
        return fieldOwner;
    }

    /**
     * Sets the field owner.
     *
     * @param fieldOwner The owner of the field that is being set.
     */
    public void setFieldOwner(Player fieldOwner) {
        this.fieldOwner = fieldOwner;
    }

}
