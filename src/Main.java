import java.util.Scanner;

public class Main {


    private static String[] usernames = new String[]{
            "joska123",
            "admin"
    };

    private static String[] passwords = new String[]{
            "asdasd",
            "szupertitkosjelszo"
    };

    public static boolean login(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String usernameInput = scanner.nextLine();
        String passwordInput = scanner.nextLine();

        boolean validUser = login(usernameInput, passwordInput);

        if (!validUser) {
            System.out.println("Invalid username or password");
            return;
        }

        System.out.println("Successfully logged in.");
    }
}