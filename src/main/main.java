package main;

import singleton.MultipleUser;
import singleton.SingleUser;
import singleton.SingletonObject;

public class main {

	public static void main(String[] args) {
		/*
		* Instanciation illégale
		* Error à la compilation :
		* Le constructeur SingleUser() n'est pas visible
		* SingleUser objetUnique = new SingleUser();
		*/
		// Récupération de l'instance unique de la classe SingletonObject
		SingleUser objetUnique = SingleUser.getInstance();
		SingleUser objetUnique1 = SingleUser.getInstance();
		
		System.out.println ("======================Singleton===============");
		System.out.println ("object 1 "+objetUnique.toString());
		System.out.println ("object 2 "+objetUnique1.toString());
		
		/*
		* Instanciation multiple
		*/
		MultipleUser multipleUser = new MultipleUser();
		MultipleUser multipleUser1 = new MultipleUser();
		System.out.println ("======================Multiple User===============");
		System.out.println (multipleUser.toString());
		System.out.println (multipleUser1.toString());
	}
}
