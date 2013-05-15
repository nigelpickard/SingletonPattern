package com.npickard.patterns.singleton;


public enum EnumSingleton {
	INSTANCE;
	
	@Override
	public String toString(){
		return "Simple enum singleton.";
	}
}
