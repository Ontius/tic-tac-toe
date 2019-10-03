/**
 * Holds information about a player.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class Player {

    /**
     * The name of the player.
     */
    private String name;

    /**
     * This constructor creates a {@link Player} instance with the given {@code name}.
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The name of the player that is being set.
     */
    public void setName(String name) {
        this.name = name;
    }

}
