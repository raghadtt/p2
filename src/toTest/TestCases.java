package toTest;

import static org.junit.Assert.*;


import org.junit.Test;

import code.calc;


public class TestCases {

	@Test
	public void test() {
		calc c = new calc();
		int act= c.add(4,2);
		assertTrue (act==6);
	
	}
	@Test
	public void test2() {
		calc c = new calc();
		int act= c.add(4,-2);
		assertTrue (act==2);
	
	}
	@Test
	public void test3() {
		calc c = new calc();
		int act= c.add(-4,-2);
		assertTrue (act==-6);
	
	}
	
	@Test
	public void test4() {
		calc c = new calc();
		int act= c.add(-4,2);
		assertTrue (act==-2);
	
	}
}
