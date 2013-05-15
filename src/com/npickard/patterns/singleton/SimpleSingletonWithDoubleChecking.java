/**
 * 
 */
package com.npickard.patterns.singleton;

/**
 * @author nigel
 *
 */
public class SimpleSingletonWithDoubleChecking {
	private static SimpleSingletonWithDoubleChecking instance = null;
	
	/**
	 * private constructor so that a SimpleSingleton can only be
	 * created from inside the class
	 */
	private SimpleSingletonWithDoubleChecking(){
	}
	
	/**
	 * 
	 * Gets a singleton instance. Note the use of lazy initialization
	 * and the double checking.  Per this article:
	 * http://www.ibm.com/developerworks/java/library/j-dcl/index.html
	 * double checking doesn't precisely work. The simple singleton
	 * class, though more expensive, is better to use.
	 * 
	 * @return a SimpleSingleton
	 */
	public static SimpleSingletonWithDoubleChecking getInstance(){
		if (instance==null){
			synchronized(SimpleSingletonWithDoubleChecking.class){
				if (instance==null){
					instance = new SimpleSingletonWithDoubleChecking();
				}
			}
		}
		return instance;
	}
	
	@Override
	public String toString(){
		return "Simple singleton with lazy initialization, synchronized getInstance method and double checking.";
	}
}
