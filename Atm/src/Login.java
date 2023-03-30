import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
            String username;
            String parola;

        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Password : ");
        parola = scanner.nextLine();

        if (hesap.getusername().equals(username) && hesap.getParola().equals(parola)) {
            return true;
        }else {
            return false;
        }

    }
}
