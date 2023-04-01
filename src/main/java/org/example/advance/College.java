package org.example.advance;

public class College extends School implements SchoolInterface{

    private String footballClub;

    public College() {
    }

    public College(String name, String address, Integer numberOfStudents, String directorName) {
        super(name, address, numberOfStudents, directorName);
    }

    @Override
    public void register() {
        System.out.println("Welcome to college");
    }
    public void collegeSchool(){
        System.out.println("this is only for college school");
    }

    @Override
    public void method1() {
        System.out.println("college method1");
    }
}
