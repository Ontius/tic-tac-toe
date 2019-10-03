/**
 * Contains the basic configuration of a game. This configuration is for initialization purposes.
 *
 * @author Patrick Egli
 * @version 1.0.0
 */
public class Configuration {

    /**
     * The name of the language.
     */
    private String languageName;

    /**
     * The name of the player A.
     */
    private String playerAName;

    /**
     * The name of the player B.
     */
    private String playerBName;

    /**
     * The default constructor.
     *
     * @param playerAName The name of player A.
     * @param playerBName The name of player B.
     */
    public Configuration(String playerAName, String playerBName) {
        this(playerAName, playerBName, "german");
    }

    /**
     * Creates a {@link Configuration} instance with a preconfigured language name.
     *
     * @param languageName The name of the language.
     * @param playerAName The name of player A.
     * @param playerBName The name of player B.
     */
    public Configuration(String playerAName, String playerBName, String languageName) {
        setPlayerAName(playerAName);
        setPlayerBName(playerBName);
        setLanguageName(languageName);
    }

    /**
     * Sets the language name.
     *
     * @param languageName The name of the language that is being set.
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * Returns the name of the language.
     *
     * @return The name of the language.
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Returns the name of player A.
     *
     * @return The name of player A.
     */
    public String getPlayerAName() {
        return playerAName;
    }

    /**
     * Sets the name of player A.
     *
     * @param playerAName The name of player A.
     */
    public void setPlayerAName(String playerAName) {
        this.playerAName = playerAName;
    }

    /**
     * Returns the name of player B.
     *
     * @return The name of player B.
     */
    public String getPlayerBName() {
        return playerBName;
    }

    /**
     * Sets the name of player B.
     *
     * @param playerBName The name of player B.
     */
    public void setPlayerBName(String playerBName) {
        this.playerBName = playerBName;
    }

}