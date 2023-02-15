import models.Etudiant;

public class Application1 {

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("BASSAM", "Miraide", 'F', 15, 1234, "MP-ISI");
        etudiant.sePresenter();
    }
}
