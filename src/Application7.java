import exceptions.BadFormatAuthentificationDataException;
import exceptions.NullAuthentificationDataException;
import models.User;

public class Application7 {

    public static void main(String[] args) {
        User user = new User("admin", "passer1234");

        try {
            if (user.authenticateUser()) {
                System.out.println("Welcome Admin");
            } else {
                System.err.println("Wrong identifier!");
            }
        } catch (NullAuthentificationDataException | BadFormatAuthentificationDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
