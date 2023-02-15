import models.Etudiant;

public class Application1 {

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("KOUNASSO", "Lazare Razacki", 'M', 12, 1234, "MP-ISI");
        etudiant.sePresenter();
    }
}
