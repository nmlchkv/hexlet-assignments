package exercise.dto.users;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
public class UserPage {
    private final User user;

    public UserPage(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
// END
