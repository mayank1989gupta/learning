/**
 * 
 */
package com.learning.singleton;

/**
 * @author Mayank
 *
 */
public class SingletonTest {

	private static SingletonTest instance;

	private SingletonTest() {

	}

	/**
	 * Double Lock Mechanism.</br>
	 * 
	 * @return
	 */
	public static SingletonTest getInstance() {
		if(instance == null) {
			synchronized (SingletonTest.class) {
				if(null == instance) {
					instance = new SingletonTest();
				}
			}
		}

		return instance;
	}
}
