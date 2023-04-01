package org.example.advance;

public class Primary extends School implements SchoolInterface{


    public String abetareFest;

    public Primary() {
    }

    public Primary(String name, String address, Integer numberOfStudents, String directorName) {
        super(name, address, numberOfStudents, directorName);
    }

    @Override
    public void register() {
        System.out.println("Welcome to primary school");
    }

    public void primarySchool(){
        System.out.println("this is only for primary school");
    }

    @Override
    public void method1() {
        System.out.println("Primary methotd1");
    }
}
