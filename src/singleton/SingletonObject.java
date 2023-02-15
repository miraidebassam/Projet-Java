package singleton;

public class SingletonObject {
	/*
	1 - Création de l'instance de l'objet dès le
	* chargement de la classe par la JVM (ClassLoader).
	* Garantit une atomicité de l'action ...
	*/
	private static SingletonObject instance = new SingletonObject();

	
	/*
	 *	Constructeur rendu private
		Pour éviter qu'un autre objet soit instancié
	*/
	private SingletonObject() {}

	// Renvoie l'unique objet disponible
	public static SingletonObject getInstance () {
		//Returner une seule instance
		return instance ;
	}
}
