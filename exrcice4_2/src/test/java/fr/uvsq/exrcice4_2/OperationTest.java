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
	
	@Test
	public void testPlus() {
		
		double val1=9.0,val2=6.0;
		CommandStore store = new CommandStore((double) val1,mot);
		
		store.apply();
		store.setNumber(val2);
		store.apply();
		ApplicationCom cm= new ApplicationCom(Operation.Plus,mot);
		cm.apply();
		assertEquals(Double.valueOf(mot.operandes.get(0)), Double.valueOf(15.0));
		
		
	}
	// Le test de l'oeration moins
	@Test
	public void testMoins() {
		double val1=9.0,val2=3.0;
		
		CommandStore store = new CommandStore((double) val1,mot);
		
		store.apply();
		store.setNumber(val2);
		store.apply();
		ApplicationCom cm= new ApplicationCom(Operation.Moins,mot);
		cm.apply();
		assertEquals(Double.valueOf(mot.operandes.get(0)), Double.valueOf(6.0));
		
		
	}

	

	


}
