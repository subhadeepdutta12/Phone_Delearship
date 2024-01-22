package io;

import java.io.IOException;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		Smartphone sm1= new Smartphone("Iphone 13",75000,"red");
		Smartphone sm2= new Smartphone("Iphone 12",60000,"blue");
		Smartphone sm3= new Smartphone("galaxy flip3",85000,"black");
		Smartphone sm4= new Smartphone("galaxy fold3",150000,"white");
		
		Employee e1= new Employee("John",1);
		Employee e2= new Employee("Nesh",2);
		Employee e3= new Employee("Trevor",3);
		
		
		Customer cm1= new Customer("A",80000);
		Customer cm2= new Customer("B",90000);
		Customer cm3= new Customer("C",40000);
		
//		cm1.buy(sm1);
//		e1.sellPhone(cm1, sm1);
		
//		cm2.buy(sm4);
//		e3.sellPhone(cm2, sm4);
		
		cm3.buy(sm2);
		e3.sellPhone(cm3, sm2);
		

	}

}
