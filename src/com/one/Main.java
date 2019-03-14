package com.one;

public class Main {

	private final int[] pocket = {50,20,5,5,1,1,1};
	
	public boolean numberAvailable( int x ) {
		
		int currentNumber = x ;
		for( int i=0 ; i<pocket.length ; i++) {
			
			if( currentNumber >= pocket[i] ) {
				currentNumber = currentNumber - pocket[i];
			}
			
		}
		return currentNumber == 0 ? true : false ;
	}
	
	public static void main (String[] args) {
		
		Main main = new Main();
		System.out.println( main.numberAvailable(83));
		
	}
}
