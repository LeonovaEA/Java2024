import java.time.LocalDateTime;

public class UserSession {
    private User user;
    private LocalDateTime loginTime;
    private LocalDateTime logoutTime;

    public UserSession(User user) {
        this.user = user;
        this.loginTime = LocalDateTime.now();
    }

    public void logout() {
        this.logoutTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "UserSession{user=" + user.getUsername() + ", loginTime=" + loginTime + ", logoutTime=" + logoutTime + "}";
    }
}
