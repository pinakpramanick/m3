package com.cg.helper;

import java.util.regex.Pattern;
import java.lang.Exception;

public class Validator {
	public static boolean validateID(String id) throws Exception {
		String pattern="(\\d){5}";
		try {if(Pattern.matches(pattern,id)){
			return true;
		}
		else
	throw new Exception("Hello");}
		catch (Exception e)
		{
			System.out.println("tested ok");
			return false;
		}
		
		
	}
	
	public static boolean validateName(String name) throws Exception{
		String pattern="[a-z]{3,10}";
		try
		{
			if(Pattern.matches(pattern,name)){
		
			return true;
		}
		else throw new Exception("Enter in the correct format");
		}
		catch (Exception e){
			System.out.println("enter in correct format");
			return false;
		}
			
	}
	public static boolean validatePrice(String price) throws Exception{
		String pattern="[0-9]{1,10}";
		try{
			if(Pattern.matches(pattern,price)){
		
			return true;
		}
		else throw new Exception("Enter in the correct format");
		}
		catch (Exception e){
			System.out.println("enter in correct format");
			return false;}
	}

}
