package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	//JJ
	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	//Yilin
	@Test
	public void testPutOne() {
		MapADT<String, String> testPut = new JavaMap<>();
		testPut.put("key", "value");
		assertEquals(testPut.size(),1);
	}
	
	//Yilin
	@Test
	public void testRepeatedPut() {
		MapADT<String, String> testRepeatedPut = new JavaMap<>();
		testRepeatedPut.put("key", "value");
		testRepeatedPut.put("anotherkey","value");
		testRepeatedPut.put("key","value");
		testRepeatedPut.put("key","anothervalue");
		assertEquals(testRepeatedPut.size(),2);
		assertEquals(testRepeatedPut.get("key"),"anothervalue");
	}
	
	@Test
	public void testGet() {
		MapADT<String, String> testGet = new JavaMap<>();
		//
		assertEquals(testGet.get("key"),null);
	}
	
	@Test
	public void testSize() {
		
	}
	
	@Test
	public void testRemove() {
		
	}
}
