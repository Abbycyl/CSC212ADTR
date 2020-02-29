package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

// Wow, this class really needs some comments...
public class Challenges {

	public static SetADT<String> union(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		
		return output;
	}
	
	//Yilin
	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
	  SetADT<String> output = new JavaSet<>();
	  for (String element: left) {
	   if (right.contains(element)) {
	    output.insert(element);
	   } 
	  }
	  return output;
	 }
	 
	 //Yilin
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
	  MapADT<String, Integer> output = new JavaMap<>();
	  for (String word: words) {
	   System.out.println(words.size() + word + output.get(word)+ "\n");
	   if (output.get(word) == null) { // appear for the first time
	    output.put(word, 1);
	   } else if (output.get(word) >= 1){ // value += 1
	    output.put(word,output.get(word)+1);
	   }
	  }
	  return output;
	}
}
