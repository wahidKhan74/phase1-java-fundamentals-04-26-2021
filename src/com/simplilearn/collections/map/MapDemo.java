package com.simplilearn.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		// Map : is a collection of key value pair
		// key should be unique.
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new Hashtable<String, String>();
		Map<String, String> map3 = new TreeMap<String, String>();

		// HashMap : not thread safe 
		Map<String, String> phoneBook = new HashMap<String, String>();

		phoneBook.put("John", "8080808081");
		phoneBook.put("Mike", "8080808082");
		phoneBook.put("Amit", "8080808083");
		phoneBook.put("Vijya", "8080808084");
		phoneBook.put("Abdul", "8080808085");
		phoneBook.put(null, "8080808086");
		phoneBook.put("Abdul", "8080808087");

		System.out.println(phoneBook);

		// access data over map
		System.out.println(phoneBook.get("Mike"));
		System.out.println(phoneBook.get("Abdul"));
		System.out.println(phoneBook.get(null));

		System.out.println("-------------------");
		
		// Hashtable : thread safe
		Map<String, Double> listOfItemes = new Hashtable<String, Double>();
		listOfItemes.put("Apple", 37.34);
		listOfItemes.put("Orange", 87.34);
		listOfItemes.put("Apple", 7.34);
		listOfItemes.put("Banana", 17.34);
		listOfItemes.put("Oils", 89.34);
		
		System.out.println(listOfItemes);
		System.out.println("Orange Price :: " + listOfItemes.get("Orange"));
		
		System.out.println("-------------------");
		// TreeMap : Sorted Map
		Map<Integer, String> listOfEmployee = new TreeMap<Integer, String>();
		
		listOfEmployee.put(1001, "John Doe");
		listOfEmployee.put(1002, "Mike Smith");
		listOfEmployee.put(1004, "William Doe");
		listOfEmployee.put(1003, "Vijay Kumar");
		
		System.out.println(listOfEmployee);
		System.out.println("Id 10003 => "+ listOfEmployee.get(1003));
		
		System.out.println("-------------------");
		
		// iterate over map
		// old syntax  -> iterator over keys ->  key value based 
		// step 1. get all entries as set 
		Collection entrySet = listOfEmployee.entrySet();
		Iterator itr = entrySet.iterator();
		
		// step 2. iterate over keys
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------");
		// new syntax  -> enhanced for loop.
		// step 1. get all key as set 
		Set<Integer> allKeys = listOfEmployee.keySet();
		
		// step 2. iterate over keys
		for(Integer key : allKeys) {
			System.out.println(key +" :=> "+listOfEmployee.get((key)));
		}
		

	}
}
