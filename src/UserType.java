public enum UserType {
    ADMIN("A"),
    PATIENT("P");

    private final String _userCode;
    UserType(final String userCode) {
        _userCode = userCode;
    }

    public String getUserCode() {
        return _userCode;
    }

}
