package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class JSONArray {
    public static void main(String[] args) throws Exception {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(people);

        System.out.println(jsonArray);
    }
}

