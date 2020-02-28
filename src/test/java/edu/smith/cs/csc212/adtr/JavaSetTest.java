package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	//JJ
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	//JJ
	@Test
	public void testInsertOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("testInsertOnce");
		assertEquals(one.size(),1);
	}
	
	//JJ
	@Test
	public void testRepeatedInsert() {
		SetADT<String> repeatedInsert = new JavaSet<>();
		repeatedInsert.insert("element0");
		repeatedInsert.insert("element1");
		repeatedInsert.insert("element1");
		repeatedInsert.insert("element1");
		assertEquals(repeatedInsert.size(),2);
	}
	
	//Yilin
	@Test
	public void testContains() {
		SetADT<String> contains = new JavaSet<>();
		contains.insert("testContains");
		//return true for sth contained
		assertTrue(contains.contains("testContains"));
		//return false for sth not contained
		assertFalse(contains.contains("sth not in the set"));
	}
	
	//Yilin
	@Test
	public void testRemove() {
		SetADT<String> remove = new JavaSet<>();
		//can be removed
		remove.insert("testRemove");
		remove.remove("testRemove");
		//removing sth not in the set causes no error and does not affect the set
		remove.remove("sth not in the set");
		
		assertEquals(remove.size(),0);
		assertFalse(remove.contains("testRemove"));
	}
	
	
}
