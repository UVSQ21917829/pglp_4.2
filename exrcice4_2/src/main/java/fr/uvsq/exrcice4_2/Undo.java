package fr.uvsq.exrcice4_2;

public class Undo implements Interfacecommand {

	
	private Interpreter interpreter;

	public Undo(Interpreter interpreter) {
		this.interpreter = interpreter;
	}
	public void apply() {
		// TODO Auto-generated method stub
		
		this.interpreter.undo();
		
	}

}
