import java.util.ArrayList;
class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        users.add(new User("test", "test"));
    }
    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                // Username already exists
                return null;
            }
        }
        // Username is not taken, add the new user
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise

    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                // Username and password match
                return user;
            }
        }
        // Username not found or password incorrect
        return null;
    }
}