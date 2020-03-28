package fr.uvsq.exrcice4_2;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple .
 */
public class AppTest 
 
{
    

	MoteurRPN moteur;
	@Before
	public void initialization() {
    	this.moteur = new MoteurRPN();
    }
	
	@Test
    public void storeTest() {
    	
    	CommandStore store = new CommandStore((double) 12,moteur);
    	store.apply();	
    	assertEquals(12, moteur.operandes.pop(), 0);
    	
    	
    }
	@Test
    public void storeTestSetNumber() {
    	
    	CommandStore store = new CommandStore((double) 12,moteur);
    	store.setNumber((double) 3);
    	store.apply();	
    	assertEquals(3, moteur.operandes.pop(), 0);
    	
    	
    }
	
   
}
