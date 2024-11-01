package com.java.constructors;

public class Student {
    private int id;
    private String name;

    public Student(){
        System.out.println("inside 0 argument constructor");
        this.id = 0;
        this.name= "unknown";
    }

    public Student(int id){
        System.out.println("inside 1 argument constructor");
        this.id =id;
        this.name = "unknown";
    }

    public Student(int id, String name){
        System.out.println("inside 2 argument constructor");
        this.id =id;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
