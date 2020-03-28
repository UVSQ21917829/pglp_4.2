package fr.uvsq.exrcice4_2;

public class QuitCommand implements Interfacecommand{

	private Interpreter interpretr;
	
	public QuitCommand(Interpreter interpretr) {
	
		this.interpretr = interpretr;
	}

	public void apply() {
		// TODO Auto-generated method stub
		this.interpretr.quit();
	}

}
