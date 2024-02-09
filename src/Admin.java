public class Admin extends User {
    public Admin() {
        super();
    }

    @Override
    public boolean isAdmin() {
        return true;
    }
}
