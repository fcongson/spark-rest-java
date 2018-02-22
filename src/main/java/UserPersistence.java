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

    public User editUser(User user, String id) {
        User existing = users.get(id);
        if (existing != null) {
            if (user.getId() != null) {
                existing.setId(user.getId());
            }
            if (user.getEmail() != null) {
                existing.setEmail(user.getEmail());
            }
            if (user.getFirstName() != null) {
                existing.setFirstName(user.getFirstName());
            }
            if (user.getLastName() != null) {
                existing.setLastName(user.getLastName());
            }
            users.put(user.getId(), user);
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
