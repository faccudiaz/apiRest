package com.tests;
import static org.junit.Assert.*;				
import org.junit.Test;

import com.services.CompressService;		


public class test {				

    @Test		
    public void testAssert(){					
        
        String compress1 = "AAABBAAAAABBBCCCCCCCCAAAAA";
        String compressExpected1 = "3A2B5A3B8C5A";
        String compressed1 = CompressService.compress(compress1);
        
        String compress2 = "AAaaCcCC";
        String compressExpected2 = "4A4C";
        String compressed2 = CompressService.compress(compress2);
        
        assertEquals(compressExpected1,compressed1);	
        assertEquals(compressExpected2,compressed2);	
				
    }		
}		