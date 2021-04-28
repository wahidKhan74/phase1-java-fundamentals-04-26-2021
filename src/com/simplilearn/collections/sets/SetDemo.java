package com.simplilearn.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.simplilearn.collections.list.Employee;

public class SetDemo {

	public static void main(String[] args) {

		// Set : Set is a collection of unique elements
		// Implementation classes :: HashSet, LinkedHashSet, TreeSet
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();

		// 1. HashSet :- collection of unique elements & uses hashcode of the object
		// store values
		// IT does not preserve insertion order.
		Set<String> setOfCompanies = new HashSet<String>();

		boolean res1 = setOfCompanies.add("DELL");
		setOfCompanies.add("MCIT");
		boolean res2 = setOfCompanies.add("DELL");
		setOfCompanies.add("SIMPLILEARN");
		setOfCompanies.add("KPMG");

		System.out.println(setOfCompanies);
		System.out.println(res1);
		System.out.println(res2);

		System.out.println("--------------------");
		// LinkedHashSet : It stores unique values with preserving insertion order.
		Set<String> setOfCities = new LinkedHashSet<String>();
		setOfCities.add("New York");
		setOfCities.add("LA");
		setOfCities.add("Mumbai");
		setOfCities.add("LA");

		System.out.println(setOfCities);
		System.out.println("--------------------");
		// TreeSet : It stores unique values with ascending ordered data collection
		// (Sorted Set)
		TreeSet<String> setOfUniqueNames = new TreeSet<String>();
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Mike");
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Will");
		setOfUniqueNames.add("Bryan");
		setOfUniqueNames.add("Bryan");

		System.out.println(setOfUniqueNames);
		System.out.println(setOfUniqueNames.descendingSet());

		// set iterator -> old syntax
		Iterator<String> itr = setOfUniqueNames.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------");
		// enhance for loop -> new syntax over list
		for (String emp : setOfUniqueNames) {
			System.out.println(emp);
		}

	}

}
