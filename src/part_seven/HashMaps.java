package part_seven;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {
	public void hashmapping() {
		HashMap<String, String> salaries = new HashMap<String, String>();
		salaries.put("Ali ", " $4000");
		salaries.put("Selim ", " $3250");
		salaries.put("Osman ", " $2700");
		salaries.put("Zeynep ", " $6120");
		salaries.put("Kemal ", " $6550");
		salaries.put("Burak ", " $1950");
		System.out.println("HashMap: \n" + salaries + "\nKeySet Employees:");
		
		for(String employee: salaries.keySet()) {
			System.out.println(employee + ":" + salaries.get(employee));
		}
		System.out.println("\nUsed Map.Entry \n");
		for(Map.Entry<String,String> employees : salaries.entrySet()) {
			System.out.println(employees.getKey() + ":" +  employees.getValue());
		
		}
	}
	
	public void linkedhashmapping() {
		LinkedHashMap<String, String> salaries = new LinkedHashMap<String, String>();
		salaries.put("Ali ", " $4000");
		salaries.put("Selim ", " $3250");
		salaries.put("Osman ", " $2700");
		salaries.put("Zeynep ", " $6120");
		salaries.put("Kemal ", " $6550");
		salaries.put("Burak ", " $1950");
		System.out.println("\nLinkedHashMap: \n" + salaries + "\nKeySet Employees:");
		
		for(String employee: salaries.keySet()) {
			System.out.println(employee + ":" + salaries.get(employee));
		}
		System.out.println("\nUsed Map.Entry \n");
		for(Map.Entry<String,String> employees : salaries.entrySet()) {
			System.out.println(employees.getKey() + ":" +  employees.getValue());
			
		}
}
	
	public void treemapping() {
		TreeMap<String, String> salaries = new TreeMap<String, String>();
		salaries.put("Ali ", " $4000");
		salaries.put("Selim ", " $3250");
		salaries.put("Osman ", " $2700");
		salaries.put("Zeynep ", " $6120");
		salaries.put("Kemal ", " $6550");
		salaries.put("Burak ", " $1950");
		System.out.println("\nTreeMap: \n" + salaries);
		
		for(String employee: salaries.keySet()) {
			System.out.println(employee + ":" + salaries.get(employee));
		}
	
		System.out.println("\nUsed Map.Entry \n");
		for(Map.Entry<String,String> employees : salaries.entrySet()) {
			System.out.println(employees.getKey() + ":" +  employees.getValue());
		
		}
	}
	public void treemappingforintegers() {
		TreeMap<Integer, Integer> idAndSalaries = new TreeMap<Integer, Integer>();
		idAndSalaries.put(78234520, 3450);
		idAndSalaries.put(78267761, 2750);
		idAndSalaries.put(78243652, 6850);
		idAndSalaries.put(78234943, 5100);
		idAndSalaries.put(78234294, 2800);
		idAndSalaries.put(78234575, 7750);
		System.out.println(idAndSalaries);
		for(Integer id: idAndSalaries.keySet()) {
			System.out.println(id + ":" + idAndSalaries.get(id));
		}
	}
}
