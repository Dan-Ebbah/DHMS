public abstract class User {
    public static final int MAX_ID_LENGTH = 8;
    private String userID;

    public abstract boolean isAdmin();

    private boolean isValidId() {
        int length = userID.trim().length();
        return length != MAX_ID_LENGTH;
    }
}
