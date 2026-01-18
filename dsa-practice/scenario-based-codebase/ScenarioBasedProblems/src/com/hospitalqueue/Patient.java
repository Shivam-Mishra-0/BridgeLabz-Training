
package com.hospitalqueue;

public class Patient {
 private String name;
 private int arrivalTime;
 private int criticality; 

 public Patient(String name, int arrivalTime, int criticality) {
     this.name = name;
     this.arrivalTime = arrivalTime;
     this.criticality = criticality;
 }

 public String getName() {
     return name;
 }

 public int getArrivalTime() {
     return arrivalTime;
 }

 public int getCriticality() {
     return criticality;
 }
}
