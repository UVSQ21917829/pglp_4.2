package fr.uvsq.exrcice4_2;

import java.util.Stack;

public class MoteurRPN extends Interpreter{
	
	//les opérandes

	public MoteurRPN() {
		
		super();
	}

	

	
	// la methode de l'enregistrement
	public void enregestrerOper(double valeur) {
		operandes.add(valeur);
		Stack<Double> temp=new Stack<Double>();
		temp.addAll(operandes);
		operandesPrecedent.addAll(temp);
		
		
	}
	// la methode appliquer une opération
	public void appliquerOperation(Operation Operation) throws ArithmeticException {
		if(operandes.size()>=2) {
		double val2 = (double) operandes.pop();
		double val1 = (double) operandes.pop();
		operandes.add( Operation.eval(val1,val2) );
		Stack<Double> temp=new Stack<Double>();
		temp.addAll(operandes);
		operandesPrecedent.addAll(temp);
		}
		else {
			throw new ArithmeticException("vous pouvez pas effectuer l'opération à moins de deux opérandes");
		}
	}
	//la méthode d'afficher les opérandes stockées
	public void afficherOperandes() {
		
        for(int i=0;i<operandes.size();i++){
        System.out.print(" "+operandes.get(i)+"\'");
        }
        
}

}
