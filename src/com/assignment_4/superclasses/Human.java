package com.assignment_4.superclasses;
/**
 * 
 * @author Daniel Eriksson, Viktor Löfgren
 *
 */

public class Human {
	
	private String name = "";
	private int age = 0;
	/**
	 * consructor human, takes a string, name and an int, age
	 * @param name
	 * @param age
	 */
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	/**
	 * getter getName
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter setName
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter getAge
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setAge
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}