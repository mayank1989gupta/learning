/**
 * 
 */
package com.learning.singleton;

/**
 * @author Mayank
 *
 */
public class SingletonTest {

	private static volatile SingletonTest instance;

	private SingletonTest() {

	}

	/**
	 * Double Lock Mechanism.</br>
	 * We can have the method as synchronized, but 
	 * that is expensive operation. As, everytime the method will 
	 * be called it will acquire lock.
	 * 
	 * We can also create the object in the first line, but it is advisable
	 * only if the object will be used across application.
	 * 
	 * @return
	 */
	public static SingletonTest getInstance() {
		/*First check --> this is handy once the object is created,
		* & to avoid calling synchronized block everytime.
		*/
		if(instance == null) {
			//synchronized block
			synchronized (SingletonTest.class) {
				
				if(null == instance) {
					instance = new SingletonTest();//creating the object.
				}
			}
		}

		return instance;
	}
}
