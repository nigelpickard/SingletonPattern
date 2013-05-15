/**
 * 
 */
package com.npickard.patterns.singleton;

/**
 * @author nigel
 *
 */
public class SimpleSingleton {
	private static SimpleSingleton instance = null;
	
	/**
	 * private constructor so that a SimpleSingleton can only be
	 * created from inside the class
	 */
	private SimpleSingleton(){
	}
	
	/**
	 * 
	 * Gets a singleton instance. Note the use of lazy initialization
	 * and lack of the double checking.  This singleton could be 
	 * expensive to implement.
	 * 
	 * @return a SimpleSingleton
	 */
	public static synchronized SimpleSingleton getInstance(){
		if (instance==null){
			instance = new SimpleSingleton();
		}
		return instance;
	}
	
	@Override
	public String toString(){
		return "Simple singleton with lazy initialization and synchronized getInstance method.";
	}
}
