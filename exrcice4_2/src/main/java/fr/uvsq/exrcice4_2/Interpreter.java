package fr.uvsq.exrcice4_2;

import java.util.Stack;

public class Interpreter {
	
	private Stack<Integer> pile;

	public Interpreter(Stack<Integer> pile) {
		
		this.pile = pile;
	}
	
	//undo pour l'innulation
	public void undo() {
		this.pile=pile;
	}
	
	//quitter 
	public void quit() {
		System.exit(0);
	}

}
