import models.Etudiant;

public class Application5 {

    public static void main(String[] args) {
        testException();
        testRuntimeException();
    }

    public static void testRuntimeException() {
        Etudiant etudiant = new Etudiant("", "Lazare", 'M',  12890, "MP-ISI");
        try {
            etudiant.setAge(10);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        etudiant.sePresenter();
    }

    public static void testException() {
        try {
            Etudiant etudiant = new Etudiant("KOUNASSO", "Lazare", 'M', -17, 12890, "MP-ISI");
            etudiant.sePresenter();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
