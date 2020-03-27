package fr.uvsq.exrcice4_2;

import java.util.Scanner;

public class SaisieRPN 
{
public final static int MAX_VALEUR=1000;
public final static int MIN_VALEUR=-1000;

private Scanner scanner = new Scanner(System.in);
public MoteurRPN Moteur;


public SaisieRPN(){

Moteur= new MoteurRPN();

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
	Moteur.appliquerOperation(Operation.Plus);
	Moteur.afficherOperandes();
	
}else if(str.equals("-")) {
	Moteur.appliquerOperation(Operation.Moins);
	Moteur.afficherOperandes();
	
}else if(str.equals("*")) {
	Moteur.appliquerOperation(Operation.Mult);
	Moteur.afficherOperandes();
	
}else if(str.equals("/")) {
	Moteur.appliquerOperation(Operation.Div);
	Moteur.afficherOperandes();
	
}else if(str.equals("quitter")) {
	System.exit(0);	
}
else {
	double operande = Double.parseDouble(str);
	
	if(operande>= MIN_VALEUR && operande <= MAX_VALEUR){
		
		Moteur.enregestrerOper(operande);
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