package com.practice.anagrams;
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        s.nextLine();
        for( int i=0 ; i < testcases ;i++ ){
        	StringBuilder  s1 = new StringBuilder (s.nextLine());
        	StringBuilder  s2 =new StringBuilder ( s.nextLine());
            int l1=s1.length();
            int l2 = s2.length();
            int n =l1+l2;
            for( int j=0; j<l1 ;j++){
                for(int k=0; k<l2 ; k++){
                    if(s1.charAt(j) == (s2.charAt(k)))
                    {
                        n-=2;
                        s1.setCharAt(j,'-');
                        s2.setCharAt(k,'_');
                    }
                }
            }
            System.out.println(n);
        }

    }
}
