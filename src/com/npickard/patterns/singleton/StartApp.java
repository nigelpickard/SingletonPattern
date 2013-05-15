/**
 * 
 */
package com.npickard.patterns.singleton;

/**
 * @author nigel
 * 
 * Singleton pattern.  Checkout:
 * http://www.ibm.com/developerworks/java/library/j-dcl/index.html
 * 
 *
 */
public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
		if (simpleSingleton!=null){
			System.out.println(simpleSingleton);
		}
		
		SimpleSingletonWithDoubleChecking simpleSingletonWithDoubleChecking = SimpleSingletonWithDoubleChecking.getInstance();
		if (simpleSingletonWithDoubleChecking!=null){
			System.out.println(simpleSingletonWithDoubleChecking);
		}
		
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton);

	}

}
