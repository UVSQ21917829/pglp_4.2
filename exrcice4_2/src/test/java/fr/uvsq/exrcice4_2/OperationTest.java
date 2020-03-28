package fr.uvsq.exrcice4_2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationTest {

	MoteurRPN mot;
	@Before
	public void initialization() {
		mot = new MoteurRPN();
	}


@Test (expected = ArithmeticException.class)
	public void testDivSurZero() {
		
		double val1=9.0,val2=0;
		CommandStore store = new CommandStore((double) val1,mot);
		
		store.apply();
		store.setNumber(val2);
		store.apply();
		ApplicationCom cm= new ApplicationCom(Operation.Div,mot);
		cm.apply();
		
	}
	
		
	


}
