package org.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader(new File("C:\\Users\\priya\\eclipse-workspace\\JSONSamp\\src\\test\\resources\\Sample1.json"));
	    JSONParser jsonParser	= new JSONParser();
	    Object parse = jsonParser.parse(file);
	    JSONObject jsonObj = (JSONObject)parse;
	    
	    System.out.println(jsonObj.get("id"));
	    System.out.println(jsonObj.get("type"));
	    System.out.println(jsonObj.get("name"));
	    System.out.println(jsonObj.get("ppu"));
	    
	    System.out.println("BATTERS");
        //batters
	    Object batters = jsonObj.get("batters");
	    JSONObject jsonObj2 = (JSONObject)batters;
	    Object batter = jsonObj2.get("batter");
	    
	    JSONArray jsonArr = (JSONArray)batter;
	    for(int i=0;i<jsonArr.size();i++) {
	    	Object object = jsonArr.get(i);
	    	JSONObject jsonObj3 = (JSONObject)object;
	    	System.out.println(jsonObj3.get("id")+"  "+jsonObj3.get("type"));
	    }
	    System.out.println("TOPPING");
        //topping
	    Object topping = jsonObj.get("topping"); 
	 	
	    JSONArray jsonArr1 = (JSONArray)topping;
	 	for(int j=0;j<jsonArr1.size();j++) {
	 		Object object2 = jsonArr1.get(j);
	 		JSONObject jsonObj4 = (JSONObject)object2;
	 	    System.out.println(jsonObj4.get("id")+" "+jsonObj4.get("type"));
	 		   
	   }
	 	   
	    }
	    }
	
	    
	    
	    	
	   
	    
	    
	


