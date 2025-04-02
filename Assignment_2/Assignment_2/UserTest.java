import java.util.Scanner;

class User {
    private String username;
    private String password;
    public void setUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void displayUser() {
        System.out.println("Username: " + username);
    }
}
class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Enter username: ");
        String uname = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        user.setUser(uname, pass);
        user.displayUser();
        sc.close();
    }
}