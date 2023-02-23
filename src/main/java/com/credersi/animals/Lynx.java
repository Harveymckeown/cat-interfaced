package com.credersi.animals;

public class Lynx extends Animal implements Purr, Bite {
	public Lynx() {	}
	
	public int purr() {
		return 30;
	}
	public boolean blood() {
		return true;
	}
	public int packSize() {
		return 4;
	}
}