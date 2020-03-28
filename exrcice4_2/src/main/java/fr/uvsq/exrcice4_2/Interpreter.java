package fr.uvsq.exrcice4_2;

import java.util.Stack;

public class Interpreter {
	
	protected Stack<Double> operandes;
	protected Stack<Double> operandesPrecedent;

	public Interpreter() {
		
		this.operandes = new Stack<Double>();
	}
	
	

	//undo pour l'innulation
	public void undo() {
		this.operandes=operandesPrecedent ;
	}
	
	//quitter 
	public void quit() {
		System.exit(0);
	}

}
