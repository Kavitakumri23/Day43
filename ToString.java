package com.polymorphism.OOP4;

class Student{
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kavita", 21);
        System.out.println(s1);   // calls toString() automatically
    }
}