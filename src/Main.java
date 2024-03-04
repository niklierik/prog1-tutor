import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User.users[0] = new User("joska", "fasz");
        User.users[1] = new User("pista", "kurvaanyad");
        User.users[2] = new User("peti", "asd");


        String usernameInput = scanner.nextLine();
        String passwordInput = scanner.nextLine();

        User user = User.login(usernameInput, passwordInput);

        if (user == null) {
            System.out.println("anyád");
            return;
        }

        System.out.println(user.getUsername());
    }
}