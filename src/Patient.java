public class Patient extends User {
    public Patient() {
        super();
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
