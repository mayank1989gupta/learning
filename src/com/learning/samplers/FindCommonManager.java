/**
 * 
 */
package com.learning.samplers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mayank
 * Skyscanner : Ques 2 --> To find the common manager.
 */
public class FindCommonManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		outputCommonManager(0, null);

	}

	/**
	 * Method to output Common Manager.</br>
	 * @param count
	 * @param scanner
	 */
	private static void outputCommonManager(int count, Scanner scanner) {
		Map<String,String> hierarchyList = new HashMap<String,String>();
		//scanner.nextLine();
		//String personA = scanner.nextLine();//First selected employee
		//String personB = scanner.nextLine();//Second selected employee

		String personA = "Sarah";
		String personB = "Claudiu";
		//To tae inputs for the employee relationships
		/*String inputStr = null;
		while(scanner.hasNextLine()) {
			inputStr = scanner.nextLine();
			if(inputStr.length() > 0) {
				String employee1 = inputStr.split(" ")[0];
				String employee2 = inputStr.split(" ")[1];
				addToHierarchy(hierarchyList, employee1, employee2);
			} else {
				break;
			}
		}*/

		String[] test = {"June Sarah", "Sarah Tom", "Tom Simon", "Tom Claudiu"};
		String employee1 = null;
		String employee2 = null;
		for(String str : test) {
			employee1 = str.split(" ")[0];
			employee2 = str.split(" ")[1];
			addToHierarchy(hierarchyList, employee1, employee2);//Adding to hierarchy list
		}

		findCommonManger(hierarchyList, personA,personB);//finding the common manager.</br>
	}

	/**
	 * Adding employee to the hierarchy list</br>
	 * 
	 * @param hierarchyList
	 * @param employee1
	 * @param employee2
	 */
	private static void addToHierarchy(Map<String, String> hierarchyList, String employee1 , String employee2) {
		if(hierarchyList.isEmpty()) {
			hierarchyList.put(employee1, null); // top employee ceo is managed by nobody
		}

		hierarchyList.put(employee2, employee1);//Employee --> Manager mapping as employees will be unique
	}

	/**
	 * Method to find the common manager.</br>
	 * 
	 * @param hierarchyList
	 * @param person1
	 * @param person2
	 */
	private static void findCommonManger(Map<String, String> hierarchyList, String person1 , String person2) {
		if(hierarchyList.containsKey(person1) && hierarchyList.get(person1).equals(person2)) {
			System.out.println(person2);//Manager
			return;
		} else if(hierarchyList.containsKey(person2) && hierarchyList.get(person2).equals(person1)){
			System.out.println(person1);//if person2 is the employee --> person1 will be the manager
			return;
		}

		LinkedList<String> person1Hierarchy = new LinkedList<String>();
		LinkedList<String> person2Hierarchy = new LinkedList<String>();

		buildHierarchy(hierarchyList, person1, person1Hierarchy);
		buildHierarchy(hierarchyList, person2, person2Hierarchy);

		person1Hierarchy.retainAll(person2Hierarchy);//Retaining the elements specified in the collection.
		System.out.println(person1Hierarchy.peek());//output --> peek. --> The common manager

	}
	
	/**
	 * Method to build the hierarchy.</br>
	 * @param hierarchyList
	 * @param employee
	 * @param list
	 */
	private static void buildHierarchy(Map<String, String> hierarchyList, String employee, LinkedList<String> list){
		if(employee == null) { 
			return;//Reached Parent
		}
		String manager = hierarchyList.get(employee);//Manager
		list.add(manager);//Adding to the list
		buildHierarchy(hierarchyList, manager, list); // call for manager to current employee to build chain upto top.
	}

}
