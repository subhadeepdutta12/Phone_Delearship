package io;

public class Employee {

	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public void sellPhone(Customer cm, Smartphone sm) {
		
		if(cm.cash>=sm.price) {
			
			System.out.println("Sold the smartphone to the customer: "+cm);
		}
		
		else {
			
			emi(cm, sm);
		}
		
	}
	public void emi(Customer cm, Smartphone sm) {
		
		double emi= (sm.price*1.0)/12.0;
		System.out.println("The 12-month emi for buying this smartphone wil be: "+emi);
	}
}
