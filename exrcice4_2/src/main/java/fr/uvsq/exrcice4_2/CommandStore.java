package fr.uvsq.exrcice4_2;

import java.util.Stack;

public class CommandStore implements Interfacecommand{

	private Double number;
	private MoteurRPN moteur;
	
	public CommandStore(Double number,MoteurRPN moteur) {
		
		this.number = number;
		this.moteur=moteur;
	}


	public MoteurRPN getMoteur() {
		return moteur;
	}


	public void setMoteur(MoteurRPN moteur) {
		this.moteur = moteur;
	}


	public Double getNumber() {
		return number;
	}


	public void setNumber(Double number) {
		this.number = number;
	}


	@Override
	public void apply() {
		// TODO Auto-generated method stub
		
		this.moteur.operandesPrecedent =  (Stack<Double>) this.moteur.operandes.clone();
		this.moteur.operandes.push(number);	
		
	}
	
	
	

}
