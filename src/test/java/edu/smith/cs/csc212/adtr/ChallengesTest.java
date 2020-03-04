package edu.smith.cs.csc212.adtr;

import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.errors.EmptyListError;
import edu.smith.cs.csc212.adtr.real.JavaList;
import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class ChallengesTest {

	@Test
	public void testUnionSimple() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		left.insert("A");
		left.insert("B");
		right.insert("B");
		right.insert("C");
		
		SetADT<String> expected = new JavaSet<>();
		expected.insert("A");
		expected.insert("B");
		expected.insert("C");
		Assert.assertEquals(expected, Challenges.union(left, right));
	}
	
	@Test
	//swu75
	public void testUnionOneEmptyList() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		left.insert("A");
		left.insert("B");
		
		SetADT<String> expected = new JavaSet<>();
		expected.insert("A");
		expected.insert("B");
		
		Assert.assertEquals(expected, Challenges.union(left, right));
	}
	
	@Test 
	//Yilin
	public void testUnionTwoEmptyList() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		SetADT<String> expected = new JavaSet<>();
		
		Assert.assertEquals(expected, Challenges.union(left, right));
		Assert.assertEquals(Challenges.union(left, right).size(),0);
	}
	
	
	
	@Test
	public void testIntersectionSimple() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		left.insert("A");
		left.insert("B");
		right.insert("B");
		right.insert("C");
		
		SetADT<String> expected = new JavaSet<>();
		expected.insert("B");
		Assert.assertEquals(expected, Challenges.intersection(left, right));
	}
	
	@Test
	//swu75
	public void testIntersectionOneEmptyList() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		left.insert("A");
		left.insert("B");
		
		SetADT<String> expected = new JavaSet<>();
		Assert.assertEquals(expected, Challenges.intersection(left, right));
	}
	
	@Test
	//swu75
	public void testIntersectionTwoEmptyList() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		SetADT<String> expected = new JavaSet<>();

		Assert.assertEquals(expected, Challenges.intersection(left, right));
	}
	
	@Test
	//swu75
	public void testIntersectionTwoIdenticalList() {
		SetADT<String> left = new JavaSet<>();
		SetADT<String> right = new JavaSet<>();
		
		left.insert("A");
		left.insert("B");
		right.insert("A");
		right.insert("B");
		
		SetADT<String> expected = new JavaSet<>();
		expected.insert("A");
		expected.insert("B");
		Assert.assertEquals(expected, Challenges.intersection(left, right));
	}
	
	@Test
	public void testWordCountSimple() {
		ListADT<String> example = new JavaList<>();
		for (String word : new String[] {"a", "b", "a", "b", "c", "d"}) {
			example.addBack(word);
		}
		MapADT<String, Integer> expected = new JavaMap<>();
		expected.put("a", 2);
		expected.put("b", 2);
		expected.put("c", 1);
		expected.put("d", 1);
		
		Assert.assertEquals(expected, Challenges.wordCount(example));
	}
	
	
	
	

}
