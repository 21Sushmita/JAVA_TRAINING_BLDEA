package com.bldea.crorepatiApp.package1;

public class Candidate {
	private String name;
	private int age;
	private String city;
	private String state;
	private static int amount;
	// source-generate constructor by using fields
	/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public Candidate(String name, int age, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public static void setAmount(int amt) {
		 amount = amt;
	}
	// source-select getters setters other than amount get only getter for others
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
// CrorepatiApp new class

}

