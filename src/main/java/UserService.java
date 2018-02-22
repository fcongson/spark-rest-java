import java.util.Collection;

public class UserService {

    private UserPersistence userPersistence = new UserPersistence();

    public void addUser(User user) {
        userPersistence.addUser(user);
    }

    public Collection<User> getUsers() {
        return userPersistence.getUsers();
    }

    public User getUser(String id) {
        return userPersistence.getUser(id);
    }

    public User editUser(User user, String id) {
        return userPersistence.editUser(user, id);
    }

    public void deleteUser(String id) {
        userPersistence.deleteUser(id);
    }

    public boolean userExist(String id) {
        return userPersistence.userExist(id);
    }
}
