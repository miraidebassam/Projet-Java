package Model;

public class Personne {

    private String nom;
    private String prenom;
    private char sexe;
    private int age;
    private static  int nbPersonnses;
    public Personne(String nom, String prenom, char sexe, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        nbPersonnses++;
    }

    public void sePresenter(){
        System.out.println(prenom + " " + nom + " age: "+ age + ", sexe:"+sexe);
    }

    public static  int getNbPersonnses(){
        return  nbPersonnses;
    }
}
