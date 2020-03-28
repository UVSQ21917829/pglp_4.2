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
   
}
