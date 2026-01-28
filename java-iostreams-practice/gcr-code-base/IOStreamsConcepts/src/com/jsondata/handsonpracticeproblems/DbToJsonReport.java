package com.jsondatahandling.handsonpracticeproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;
import java.sql.*;
import java.io.File;

public class DbToJsonReport {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            ObjectMapper mapper = new ObjectMapper();
            ArrayNode jsonArray = mapper.createArrayNode();

            while (rs.next()) {
                ObjectNode obj = mapper.createObjectNode();

                obj.put("id", rs.getInt("id"));
                obj.put("name", rs.getString("name"));
                obj.put("age", rs.getInt("age"));
                obj.put("email", rs.getString("email"));

                jsonArray.add(obj);
            }

            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File("report.json"), jsonArray);

            System.out.println("JSON report generated!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

