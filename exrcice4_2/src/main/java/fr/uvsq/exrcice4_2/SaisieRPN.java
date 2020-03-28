package fr.uvsq.exrcice4_2;

import java.util.Scanner;

public class SaisieRPN 
{
public final static int MAX_VALEUR=1000;
public final static int MIN_VALEUR=-1000;

private Scanner scanner = new Scanner(System.in);
public MoteurRPN Moteur;
private CommandFactory commandFactory;

public SaisieRPN(){

Moteur= new MoteurRPN();
this.commandFactory = new CommandFactory();
this.commandFactory.init(Moteur);
System.out.println("******************CALCULATRICE RPN*****************");
System.out.println();
System.out.println();
System.out.println("Tapez quitter pour sortir du programme");
System.out.println();
System.out.println("Veuillez entrer vos operandes (2 au min)au début avant les symboles des opérations");
System.out.println("Exemple: 234+*");

while (!false) { 
String str = scanner.nextLine();

try {

if(str.equals("+")) {
	commandFactory.executeCommand("ApplicationCom");
	
	Moteur.afficherOperandes();
	
}else if(str.equals("-")) {
	commandFactory.executeCommand("ApplicationCom");
	Moteur.afficherOperandes();
	
}else if(str.equals("*")) {
	commandFactory.executeCommand("ApplicationCom");
	Moteur.afficherOperandes();
	
}else if(str.equals("/")) {
	commandFactory.executeCommand("ApplicationCom");
	Moteur.afficherOperandes();
	
}else if(str.equals("quitter")) {
	commandFactory.executeCommand("quit");
}
else if(str.equals("undo")) {
	commandFactory.executeCommand("undo");
}
else {
	double operande = Double.parseDouble(str);
	
	if(operande>= MIN_VALEUR && operande <= MAX_VALEUR){
		
		commandFactory.executeCommand("store");
		Moteur.afficherOperandes();
	}
	else{

	System.out.println("Attention!! Veuillez saisir un nombre dans l'intervale ["+MIN_VALEUR+","+MAX_VALEUR+"]");

	}}


} catch (ArithmeticException | NumberFormatException exp) {
System.out.println("Veuillez  saisir des nombres réeles ou les symboles des operations: + - * /  ");
System.out.print(exp.getMessage());

}
}
}

}