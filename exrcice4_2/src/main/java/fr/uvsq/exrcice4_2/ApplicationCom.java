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
		
		this.op = op;
		this.moteur = moteur;
	}

	public ApplicationCom(MoteurRPN moteur2) {
		// TODO Auto-generated constructor stub
		this.moteur = moteur2;
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		
		this.moteur.appliquerOperation(op);
		
	}

}
