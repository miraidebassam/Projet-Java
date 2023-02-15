package abstractFactory;

import interfaces.Evaluation;
import interfaces.Personne;

public abstract class AbstractFactory {
	public Personne getPersonne (Class<? extends Personne> typePersonne) {
		return null ;
	}
	
	public Evaluation getEvaluation (Class<? extends Evaluation> typeEvaluation) {
		return null ;
	}
}
