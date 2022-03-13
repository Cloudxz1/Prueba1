package Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalTest {

	@Test
	
	public void test() {
		
		assertEquals("Boris", new Presidentes("Boris",4214,"Partido Comunista che").getPartido());
	}

}
