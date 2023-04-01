package org.example.advance;

public abstract class School {

    private String name;
    private String address;
    private Integer numberOfStudents;
    private String directorName;

    public School() {
    }

    public School(String name, String address, Integer numberOfStudents, String directorName) {
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
        this.directorName = directorName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }



    public abstract void register();

    public void firstDayOfSchool(){
        System.out.println("Welcome");
    }



}
