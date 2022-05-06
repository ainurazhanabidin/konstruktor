package com.company;

public class Cat {
    private String name;
    private int age;

     public Cat(String a,int b){
         this.name=a;
         this.age=b;
     }

     void setName(String a){
         name=a;
     }
     String getName(){
         return name;
     }
     void setAge(int b){
         age=b;
     }
     int getAge(){
         return age;
     }


     public Cat(){

     }



}
