package com.java.oops;

public class Encap {

	private String qaName;
	private double yearOfExperience;


	public String getQaName(){
		return qaName;
	}
	

	public void setQaName(String qaName) {
		this.qaName = qaName;
		System.out.println(qaName);
	}

	public double getYearOfExperience() {
		System.out.println("Year of Exp");
		return yearOfExperience;
	}

	public void setYearOfExperience(double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
		System.out.println(yearOfExperience);

	}
	
	
	public static void main(String args[]){
		
		Encap en = new Encap();
		en.setQaName("Karthikeyan");
		en.setYearOfExperience(7.5);
		
		
	}

}
