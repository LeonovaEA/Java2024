import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static UserManager instance;
    private Map<String, User> users = new HashMap<>();
    private Map<String, UserSession> sessions = new HashMap<>();
    private UserManager() {}
    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
    public void addUser(String username, String email) {
        User user = new User(username, email);
        users.put(username, user);
    }
    public User getUser(String username) {
        return users.get(username);
    }
    public void startSession(String username) {
        User user = users.get(username);
        if (user != null) {
            UserSession session = new UserSession(user);
            sessions.put(username, session);
            System.out.println("Сеанс начат для пользователя:" + username);
        }
    }
    public void endSession(String username) {
        UserSession session = sessions.get(username);
        if (session != null) {
            session.logout();
            System.out.println("Сеанс завершен для пользователя:" + username);
        }
    }
    public UserSession getSession(String username) {
        return sessions.get(username);
    }
}
