package main;

import abstractFactory.AbstractFactory;
import concrete_factory.ConcreteFactory;
import entity_concrete.Ecrite;
import entity_concrete.Etudiant;
import factory.EvaluationFactory;
import factory.PersonneFactory;
import interfaces.Evaluation;
import interfaces.Personne;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory factoryPersonne = ConcreteFactory.getFactory (PersonneFactory.class) ;

		Personne etudiant = factoryPersonne.getPersonne(Etudiant.class) ;
				
		etudiant.sePresenter () ;
		AbstractFactory factoryEvaluation =

		ConcreteFactory.getFactory(EvaluationFactory.class) ;
		Evaluation evaluationEcrite = factoryEvaluation.getEvaluation(Ecrite.class) ;
		evaluationEcrite.noter () ;
	}
}
