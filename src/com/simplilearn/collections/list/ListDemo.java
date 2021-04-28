package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		// List -> Order collection of data elements which allows duplicates elements.
		// List (interface) -> implementation classes -> ArrayList, LinkedList , Vector , Stack
		
		//syntax:
		List<String> list1 = new ArrayList<String>();  // not thread safe -> ordered data -> read operation
		List<String> list2 = new LinkedList<String>();  // not thread safe -> ordered data -> update(insert/delete) operation
		List<String> list3 = new Vector<String>();   // thread safe -> similar to arraylist.
		List<String> list4 = new Stack<String>();    // old collection api // legacy collections
		
		// array list
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("MCIT");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("SIMPLILEARN");
		// insert 
		listOfCompanies.add(3,"INFOSYS");
		System.out.println(listOfCompanies);
		System.out.println(listOfCompanies.get(1));
		
		for(String comp : listOfCompanies) {
			System.out.println(comp);
		}
		
		System.out.println("-----------------");
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("MUMBAI");
		listOfCities.add("NEWYORK");
		listOfCities.add("PUNE");
		listOfCities.add("NEWYORK");
		listOfCities.add("HYDERABAD");
		
		System.out.println(listOfCities);
		System.out.println(listOfCities.get(1));
		
		
		System.out.println("-----------------");
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("APPLE");
		listOfFruits.add("ORANGE");
		listOfFruits.add("KIWI");
		listOfFruits.add("ORANGE");
		listOfFruits.add("APPLE");
		
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(1));
		
		
		
		
		
	}

}
