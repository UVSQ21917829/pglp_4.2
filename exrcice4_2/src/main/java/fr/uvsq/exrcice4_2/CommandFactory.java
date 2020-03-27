package fr.uvsq.exrcice4_2;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
	private final Map<String , Interfacecommand> commands ;

	public CommandFactory() {
		super();
		this.commands = new HashMap<>();
	}
	public void addCommand(String name,Interfacecommand command ) {
		commands.put(name, command);
	}
	public void executeCommand(String name) {
		if(this.commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}
    
	public static CommandFactory init() {
		
		CommandFactory cf= new CommandFactory();
		return null;
		
	}
}
