public final class Protocol {

    public static final String SEPARATOR = "|";

    private Protocol() {
    }

    // Task 3: done
    public static String encode(MessageType type, String... fields) {
        String result = type.name();
        for (String f : fields) {
            result += SEPARATOR + f;
        }
        return result;
    }

    // Task 4: to write
    public static String[] decode(String line) {
        return null; // replace with your code
    }

    // Task 5: to write
    public static boolean isValidPseudo(String pseudo) {
        return false; // replace with your code
    }
}