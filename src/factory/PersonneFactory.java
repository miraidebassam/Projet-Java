package factory;

import abstractFactory.AbstractFactory;
import entity_concrete.Etudiant;
import entity_concrete.Formateur;
import entity_concrete.Responsable;
import interfaces.Personne;

public class PersonneFactory extends AbstractFactory {
	// Récupération de la Personne appropriée selon le type de personne
	@Override
	public Personne getPersonne (Class<? extends Personne> typePersonne) 
	{
		if ( typePersonne == null ) 
		{
			return null;
		}
		if (typePersonne == Responsable.class) 
		{
			return new Responsable ();
		} 
		else if (typePersonne == Formateur.class) 
		{
			return new Formateur ();
		} 
		else if (typePersonne == Etudiant.class) 
		{
			return new Etudiant ();
		}
			return null;
	}	
}
