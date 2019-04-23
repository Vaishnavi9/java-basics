package overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class SortArrayUsingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(7);
		list.add(2);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(3);
		
		
		
		Map<Integer, Integer> count=new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();
		for (Integer integer : list) {
			int c=count.getOrDefault(integer, 0);
			
			count.put(integer, c+1);
			outputArray.add(integer);
		}
		
		
		
		
		SortComparator comp = new SortComparator(count); 
		  
        // Sort the map using Collections CLass 
        Collections.sort(outputArray, comp); 
  
        // Final Output 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        } 
		
		
	}

}



//Implement Comparator Interface to sort the values 
class SortComparator implements Comparator<Integer> { 
 private final Map<Integer, Integer> freqMap; 

 // Assign the specified map 
 SortComparator(Map<Integer, Integer> tFreqMap) 
 { 
     this.freqMap = tFreqMap; 
 } 

 // Compare the values 
 @Override
 public int compare(Integer k1, Integer k2) 
 { 

     // Compare value by frequency 
     int freqCompare = freqMap.get(k1).compareTo(freqMap.get(k2)); 

     // Compare value if frequency is equal 
     int valueCompare = k2.compareTo(k1); 

     // If frequency is equal, then just compare by value, otherwise - 
     // compare by the frequency. 
     if (freqCompare == 0) 
         return valueCompare; 
     else
         return freqCompare; 
 } 
} 
