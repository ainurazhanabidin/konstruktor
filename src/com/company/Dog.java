package com.company;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String a,String b,int s){
        this.name=a;
        this.color=b;
        this.age=s;
    }

    void setName(String a){
        name=a;
    }
    String getName(){
        return name;
    }
    void setColor(String b){
        color=b;
    }
    String getColor(){
        return color;
    }
    void setAge(int s){
        age=s;
    }
    int getAge(){
        return age;
    }

    public Dog(){

    }
}
