import Model.Personne;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne("ndongo","cheikh",'M',24);
        Personne p1 = new Personne("Diouf","Samba",'M',24);
        p.sePresenter();
        p1.sePresenter();
        System.out.println(Personne.getNbPersonnses());

    }
}