package fr.uvsq.exrcice4_2;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
	
	private final Map<String , Interfacecommand> commands ;
    private MoteurRPN moteur;
    
	public CommandFactory() {
		this.commands = new HashMap<>();
	}
	public void addCommand(String name,Interfacecommand command ) {
		commands.put(name, command);
	}
	public Map<String, Interfacecommand> getCommands() {
		return commands;
	}
	public void executeCommand(String name) {
		if(this.commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}
    
	public  CommandFactory init(MoteurRPN moteur) {
		
			this.moteur = moteur;
			this.addCommand("quit", new QuitCommand(moteur));
			this.addCommand("undo", new Undo(moteur));
			this.addCommand("ApplicationCom", new ApplicationCom(moteur));
			this.addCommand("Store", new CommandStore(moteur));
		
		return this;
		
	}
}
