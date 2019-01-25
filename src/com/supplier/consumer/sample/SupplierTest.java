/**
 * 
 */
package com.supplier.consumer.sample;

import java.util.function.Supplier;

/**
 * @author MGupta
 *
 */
public class SupplierTest {

	public static void main(String args[]) {
		//creating the supplier for the Person Bean
		Supplier<Person> supplier = () -> {
			return new Person("ABCXYZ", 30, "XYZABCs") {
			};
		};
		
		Person person = supplier.get();//get() method returns the T --> Object  provided to the supplier definition
		System.out.println(person.getName());//sample output
	}
}
