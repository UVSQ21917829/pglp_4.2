package fr.uvsq.exrcice4_2;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private final Map<String, Interfacecommand> commands;
	private MoteurRPN moteur;

	public CommandFactory() {
		this.commands = new HashMap<>();
	}

	public void addCommand(String name, Interfacecommand command) {
		commands.put(name, command);
	}

	public Map<String, Interfacecommand> getCommands() {
		return commands;
	}

	public void executeCommand(String name) {
		if (this.commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}

	public CommandFactory init(MoteurRPN moteur) {

		this.setMoteur(moteur);
		this.addCommand("quit", new QuitCommand(moteur));
		this.addCommand("undo", new Undo(moteur));
		this.addCommand("ApplicationCom", new ApplicationCom(moteur));
		this.addCommand("store", new CommandStore(moteur));

		return this;

	}

	public void setOperation(Operation op) {

		if (commands.containsKey("ApplicationCom")) {

			((ApplicationCom) commands.get("ApplicationCom")).setOp(op);

		}
	}

	public void setNumber(Double nbr) {

		if (this.commands.containsKey("store")) {
			((CommandStore) this.commands.get("store")).setNumber(nbr);

		}
	}

	public MoteurRPN getMoteur() {
		return moteur;
	}

	public void setMoteur(MoteurRPN moteur) {
		this.moteur = moteur;
	}
}
