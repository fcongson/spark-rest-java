import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserPersistence {

    private Map<String, User> users = new HashMap<String, User>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public Collection<User> getUsers() {
        return users.values();
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public User editUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public void deleteUser(String id) {
        users.remove(id);
    }

    public boolean userExists(String id) {
        return users.containsKey(id);
    }
}
