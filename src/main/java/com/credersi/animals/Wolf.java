package com.credersi.animals;

public class Wolf extends Animal implements Howl, Bite, Pack {
	public Wolf() {	
		
		}
	
	public int howl() {
		return 115;
	}
	public boolean blood() {
		return true;
	}
	public int packSize() {
		return 9;
	}
}