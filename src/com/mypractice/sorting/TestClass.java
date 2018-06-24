package com.mypractice.sorting;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        TestClass testClass = new TestClass();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int actualSeatNumber = sc.nextInt();
            int seatNumber = actualSeatNumber%12;
            int oppositeSeatNumber = testClass.oppositeSeat(seatNumber);
            String seatType = testClass.seatType(oppositeSeatNumber);
            int actualOppositeSeatNumber = oppositeSeatNumber+12*(actualSeatNumber/12);
            System.out.println(actualOppositeSeatNumber+seatType);
             
        }
    }
    
    private int oppositeSeat(int n){
        return 13-n;
    }
    private String seatType( int n ){
    	for(int i = 0 ; i<=n ; i++) {
    		if(6*i == n || 6*i+1 == n)
    			return " WS";
    		else if(3*i-1 == n)
    			return " MS";
    	}	   	
    return " AS";
    }
}

/*18 WS 19
32 MS   29
85 WS   96
28 AS	33
13 WS	24
47 MS	38
67 WS	66
38 MS	47
1 WS	12
9 AS	4*/