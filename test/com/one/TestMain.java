package com.one;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;
public class TestMain {
	

	Main main = new Main();
	ArrayList<Integer> resultList = new ArrayList<Integer>() ;
	
	@Before
	public void allResults() {
	
		int[] pocket = {50,20,5,5,1,1,1};
		resultList.add(0);
		for( int i=0 ; i<pocket.length ; i++ ) {
			int l = resultList.size();
			for(int j = 0 ; j<l ; j++ ) {
				int newNum = resultList.get(j)+pocket[i];
				if( !resultList.contains(newNum)) {
						resultList.add(newNum);
				}
			}
		}
	}
	
		
	 @Test
	 public void testMain1() {
		assertEquals(true,main.numberAvailable(83));
	 }
	 @Test
	 public void testMain2() {
		assertEquals(true,main.numberAvailable(32));
	 }
	 @Test
	 public void testMain3() {
		assertEquals(false,main.numberAvailable(84));
	 }
	 @Test
	 public void testMain4() {
		assertEquals(true,main.numberAvailable(1));
	 }
	 @Test
	 public void testMain5() {
		for( int i = 0 ; i<= 83 ; i++ ) {
		 assertEquals( resultList.contains(i),main.numberAvailable(i));
		 
		}
	 }
}
