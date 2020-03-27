package fr.uvsq.exrcice4_2;
import java.lang.Exception;
public enum Operation {
	Plus('+') { 
		public double eval(double a,double b) {
			return a + b;
		}
	},
	Moins('-') {
		public double eval(double a,double b) {
			return a - b;
		}
	},
	Mult('*') {
		public double eval(double a,double b) {
			return a * b;
		}
	},
	Div('/') {
		public double eval(double a,double b) throws ArithmeticException {
		if (b == 0)
		throw new ArithmeticException("Impossible de diviser par 0");
		else
		return a / b;
		}
	};
	
	private char symbole;

	public char getSymbole() {
		return symbole;
	}

	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	//Constructeur
		Operation(char symbole){
			//l'ensemble des opérations 
			String sybs = "+-*/";
			// verification que le symbole appartient à la listes des symboles +-*/
			if (sybs.indexOf(symbole)==-1)
				throw new IllegalArgumentException();
			else
			this.symbole = symbole;
		}
		
	public abstract double eval(double val1, double val2) ;
}


