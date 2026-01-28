package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode; 

public class MergeJSONObjects {

	public static void main(String[] args) {
    try {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("id", 101);
        json1.put("name", "Saurav");
        json1.putArray("skills").add("Java").add("Python");
        
        ObjectNode json2 = mapper.createObjectNode();
        json2.put("age", 25);
        json2.put("email", "saurav@example.com");
        json2.put("address", "Delhi, India");
        
        json1.setAll(json2);
        
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json1));
    }catch(Exception e) {
    	e.printStackTrace();
    }
		
	}

}
