package Kissalista.Models;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David Consuegra
 */
public class UserSession {

    private HttpSession session;
    private static final String userKey = "loggedInUser";

    public UserSession(HttpServletRequest request) {
        session = request.getSession(true);
    }

    public User getCurrentUser() {
        return (User) session.getAttribute(userKey);
    }

    public void setCurrentUser(User user) {
        session.setAttribute(userKey, user);
    }

    public boolean login(String login, String password) {
        User loggedInUser = User.getUser(login, password);
        if (loggedInUser != null) {
            setCurrentUser(loggedInUser);
            return true;
        }
        return false;
    }

    public void logout() {
        session.invalidate();
    }
}
