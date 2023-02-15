import models.Etudiant;

public class Application4 {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        int[] intArray = new int[3];


        try {
            if (etudiant.getFormation().equals("MP_SI")){
                System.out.println("La formation de l'etudiant est MP_SI");
            }

            System.out.println(intArray[6]);
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){
//            MANAGE ERROR HERE
            System.err.println(e.getMessage());

        }
    }
}
