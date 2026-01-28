package com.jsondatahandling.practiceproblems;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

@JsonIgnoreProperties(ignoreUnknown = true)
class User{
	
	    private int id;
	    private String name;
	    private int age;
	    private String email;
	    private List<String> skills;
	 
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public String getEmail() { return email; }
	    public List<String> getSkills() { return skills; }

	    public void setId(int id) { this.id = id; }
	    public void setName(String name) { this.name = name; }
	    public void setAge(int age) { this.age = age; }
	    public void setEmail(String email) { this.email = email; }
	    public void setSkills(List<String> skills) { this.skills = skills; }


}
public class ReadJSONFile {

	public static void main(String[] args) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			
			User user = objectMapper.readValue(new File("src/com/jsondatahandling/resources/user.json"), User.class);
			
			 System.out.println("User Name: " + user.getName());
	         System.out.println("Skills: " + user.getSkills());

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
