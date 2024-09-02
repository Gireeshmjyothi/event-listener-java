package com.event.listener.codingPractice;


public class Student {
    private int id;
    private String name;
    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Override hashCode method
    @Override
    public int hashCode() {
        // Generate hashCode based on id and name
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    // Override equals method for the HashMap key comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }
}
