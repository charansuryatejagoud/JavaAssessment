//  In an array of 1-10, multiple numbers are duplicates, how do you find duplicates using Map implemented classes.

package ExamTasksTO;

import java.util.Map.Entry;
import java.util.*;
public class Task7 {
	public static void main(String[] args) {
	  int arr[]= {20,15,20,55,41,45,15,45,41,55};
	Map<Integer,Integer> amap=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
	if(amap.containsKey(arr[i])) {
	amap.put(arr[i], amap.get(arr[i]) + 1);
	  }
	else {
	amap.put(arr[i],1);
	     }
	  }
	Set<Entry<Integer,Integer>> en=amap.entrySet();
	for(Entry<Integer,Integer>ent:en) {
	if(ent.getValue()>1) {
	System.out.println(ent.getKey());
	         }
	      }
     	}  
	 }

	
	
	
	