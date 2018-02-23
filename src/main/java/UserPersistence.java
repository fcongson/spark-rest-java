import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserPersistence {

    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public Collection<User> getUsers() {
        return users.values();
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public User editUser(String id, User user) {
        User existing = users.get(id);
        if (existing != null) {
            existing = user;
            users.put(id, user);
        }
        return existing;
    }

    public void deleteUser(String id) {
        users.remove(id);
    }

    public boolean userExist(String id) {
        return users.containsKey(id);
    }
}
