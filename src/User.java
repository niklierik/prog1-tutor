import java.util.*;

public class User {

    public static User[] users = new User[3];

    public static User login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    private final String username;
    private String password;

    private List<String> favoriteMovies = new ArrayList<>();
    private Set<String> fasz = new HashSet<>();
    private Map<Character, Integer> map = new HashMap<>();

    public User(String username, String password) {
        this.username = username;
        setPassword(password);

    }

    public void histogram(String input) {
        var map = new HashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
            int current = map.getOrDefault(c, 0);
            current++;
            map.put(c, current);
        }


        map.get('a');
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            return;
        }
        this.password = password;
    }
}
