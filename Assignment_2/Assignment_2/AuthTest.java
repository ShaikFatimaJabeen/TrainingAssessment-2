import java.util.Scanner;

class Authentication {
    class Login {
        void checkCredentials(String username, String password) {
            if (username.equals("Nandini") && password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        }
    }
}
class AuthTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Authentication auth = new Authentication();
        Authentication.Login login = auth.new Login();
        System.out.print("Enter username: ");
        String uname = scan.next();
        System.out.print("Enter password: ");
        String pass = scan.next();
        login.checkCredentials(uname, pass);
        scan.close();
    }
}