package com.vilniuscoding.nuomospunktas;

import java.util.Scanner;

public class ScannerioKlase {
	    static Scanner ivedimas = new Scanner (System.in);
	 
	    private ScannerioKlase () {
	    }
	 
	    public static String getString () {
	        String userString = ivedimas.nextLine();
	        return userString;
	    } 
	     
	    public static int getNumber () {
	        int userNumber = ivedimas.nextInt();
	        return userNumber;
	    }
	    
	    public static long getLong () {
	        long userNumberLong = ivedimas.nextLong();
	        return userNumberLong;
	    }
	}
