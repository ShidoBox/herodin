package com.ey.br.herodin;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HerodinApplicationTests {

	@Test
    public void validatorCreate() {
    	boolean result = checkNomeHero("Miranha");    	
    	assertTrue(result);
    }
    
	@Test
    public void invalidatorCreate() {
    	boolean result = checkNomeHero("Mir4nh4");    	
    	assertFalse(result);
    }

	private boolean checkNomeHero(String string) {
		if(string.matches("[a-zA-Z]+")){
			return true;
		}
		else {
			return false;
		}
	}

}
