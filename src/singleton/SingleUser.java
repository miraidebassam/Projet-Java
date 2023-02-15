package singleton;

public class SingleUser {

	/*
	1 - Création de l'instance de l'objet dès le
	* chargement de la classe par la JVM (ClassLoader).
	* Garantit une atomicité de l'action ...
	*/
	private static SingleUser instance = new SingleUser();
	/*
	 *	Constructeur rendu private
		Pour éviter qu'un autre objet soit instancié
	*/
	private SingleUser() {}

	// Renvoie l'unique objet disponible
	public static SingleUser getInstance () {
		//Returner une seule instance
		return instance ;
	}
}
