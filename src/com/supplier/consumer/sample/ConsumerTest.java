/**
 * 
 */
package com.supplier.consumer.sample;

import java.util.function.Consumer;

/**
 * @author MGupta
 *
 */
public class ConsumerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creating a consumer
		Consumer<String> consumer = (arg) -> {
			System.out.println(arg + " Accept Method.");
		};
		//Invoking accept method --> does not return anything
		consumer.accept("Testing Consumer - ");
		
		//Adding one more consumer to test
		Consumer<String> consumer1 = (arg) -> {
			System.out.println(arg + " AndThen Method");
		};
		
		//Addthen() --> takes consumes and performs the operation
		consumer.andThen(consumer1).accept("Testing consumer1 - ");
	}
}
