package interface_adapter.clear_users;


public class ClearState {
    private String usersDeleted = "";

    public ClearState() {
    }

    public String getUsersDeleted() {
        return usersDeleted;
    }

    public void setUsersDeleted(String usersDeleted){
        this.usersDeleted = usersDeleted;
    }
}
