package com.jsondatahandling.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class Student {

	public static void main(String[] args) {

		JSONObject jsonobject = new JSONObject();
		
		JSONArray subjects = new JSONArray();
		subjects.put("java");
		subjects.put("c++");
		subjects.put("dsa");
		subjects.put("coa");
	
		jsonobject.put("name", "saurav");
		jsonobject.put("age", 24);
		jsonobject.put("subjects", subjects);
		
		System.out.println(jsonobject.toString());
	}

}
