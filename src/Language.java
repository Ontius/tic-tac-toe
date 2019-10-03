/**
 * Represents the game language
 * Currently supported: german english.
 *
 * @author Karim Ibrahim
 * @version 1.0.1
 */
public class Language {

    /**
     * Integer defines language: 1 for german , 2 for english
     */
    private int languageIndex;

    /**
     * Initializes a new Language instance with a custom defined languageIndex.
     *
     * @param languageName The name of the language.
     */
    public Language(String languageName) {
        languageIndex = convertLanguageNameToIndex(languageName);
    }

    /**
     * Returns the languages name defined by languageIndex
     *
     * @return
     */
    public String getlanguageName() {
        switch (languageIndex) {
            case 1:
                return "Deutsch";
            case 2:
                return "English";
            default:
                return "languageIndex unsupported";
        }
    }

    /**
     * Returns the Welcomemessage in the defined languageIndex.
     *
     * @return String Welcomemessage
     */
    public String getWelcomeMessage() {
        switch (languageIndex) {
            case 1:
                return "Willkommen bei TicTacToe: ";
            case 2:
                return "Welcome to TicTacToe: ";
            default:
                return "languageIndex unsupported";
        }
    }

    /**
     * Returns the  players turn message by the defined languageIndex.
     *
     * @param playerName
     * @return String
     */
    public String getActivePlayersTurnMessage(String playerName) {
        switch (languageIndex) {
            case 1:
                return "Spieler: " + playerName + " ist am Zug";
            case 2:
                return "Player: " + playerName + "'s turn ";
            default:
                return "languageIndex unsupported";
        }
    }

    /**
     * Returns the Winnermessage by the defined languageIndex.
     *
     * @param player The {@link Player} object instance.
     * @return
     */
    public String getWinnerMessage(Player player) {
        switch (languageIndex) {
            case 1:
                return "Gratuliere! " + player.getName() + " ist der glückliche Gewinner.";
            case 2:
                return "Congratulations! " + player.getName() + " is the lucky winner.";
            default:
                return "languageIndex unsupported";
        }
    }

    /**
     * Returns the draw message if no player has won.
     *
     * @return
     */
    public String getDrawMessage() {
        switch (languageIndex) {
            case 1:
                return "Unentschieden !";
            case 2:
                return "Draw !";
            default:
                return "languageIndex unsupported";
        }
    }

    /**
     * Returns the defined languageIndex.
     *
     * @return languageIndex
     */
    public int getLanguageIndex() {
        return languageIndex;
    }

    /**
     * Setts the languageIndex.
     *
     * @param languageIndex
     */
    public void setLanguageIndex(int languageIndex) {
        this.languageIndex = languageIndex;
    }

    /**
     * Converts the {@code languageName} to an internal index.
     * The index of 1 represents the language German and
     * the index of 2 represents the language English.
     *
     * @param languageName The name of the language.
     * @return The internal index of the language.
     */
    private int convertLanguageNameToIndex(String languageName) {
        switch(languageName) {
            case "german":
                return 1;
            case "english":
                return 2;
            default: return 1;
        }
    }
}
