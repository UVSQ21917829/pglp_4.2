package fr.uvsq.exrcice4_2;

public class ApplicationCom implements Interfacecommand {

	private Operation op;
	private MoteurRPN moteur;

	public void setOp(Operation op) {
		this.op = op;
	}

	public void setMoteur(MoteurRPN moteur) {
		this.moteur = moteur;
	}

	public ApplicationCom(Operation op, MoteurRPN moteur) {
		super();
		this.op = op;
		this.moteur = moteur;
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		
		this.moteur.appliquerOperation(op);
		
	}

}
