package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void howl() {
		Wolf wolf = new Wolf();
		assertEquals(wolf.howl(), 115);
	}
	@Test
	public void bite() {
		Lynx lynx = new Lynx();
		assertTrue(lynx.blood());
	}
	
	private int stroke(Purr purrer) {
		return purrer.purr();
	}
	@Test
	public void testPurr() {
		Purr cat = new Cat();
		Purr lynx = new Lynx();
		assertEquals(this.stroke(cat), 25);
		assertEquals(this.stroke(lynx), 30);
	}
	
	private boolean Blood(Bite bloody) {
		return bloody.blood();
	}
	@Test
	public void testBite() {
		Bite cat = new Cat();
		Bite lynx = new Lynx();
		Bite wolf = new Wolf();
		
		assertEquals(this.Blood(cat), true);
		assertEquals(this.Blood(lynx), true);
		assertEquals(this.Blood(wolf), true);
	}
	
}