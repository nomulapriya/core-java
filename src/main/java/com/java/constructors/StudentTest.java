package com.java.constructors;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getId());
        System.out.println(student1.getName());

        Student student2 = new Student(1);
        System.out.println(student2.getId());
        System.out.println(student2.getName());

        Student student3 = new Student(1, "aa");
        System.out.println(student3.getId());
        System.out.println(student3.getName());

    }
}