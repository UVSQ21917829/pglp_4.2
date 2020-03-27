package fr.uvsq.exrcice4_2;

public class CommandStore implements Interfacecommand{

	private Integer number;
	
	
	public CommandStore(Integer number) {
		
		this.number = number;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	@Override
	public void apply() {
		// TODO Auto-generated method stub
		
		
	}
	
	
	

}
