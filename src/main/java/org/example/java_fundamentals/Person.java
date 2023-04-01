package org.example.java_fundamentals;

public class Person {

    private String name;
    private String lastName;


    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person() {
    }

    public Double salary(){
        return 1.0;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
