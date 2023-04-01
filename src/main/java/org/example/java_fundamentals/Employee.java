package org.example.java_fundamentals;

public class Employee extends Person{
    private String department;
    private Double workHours;
    private Double salary;


    public Employee(){
        super();
    }
    public Employee(String name, String lastName, String department){
        super(name, lastName);
        this.department = department;
        workHours = 156.0;
        this.salary();
    }
    public Employee(String name, String lastName) {
        super(name, lastName);
    }

    public Double salary(){

        if(workHours == null){

        }
        else if(department.equalsIgnoreCase("it")){
            salary=workHours*10;
        }
        else if (department.equalsIgnoreCase("Finace")){
            salary=workHours*15;
        }
        else if (department.equalsIgnoreCase("show")) {
            salary=workHours*5;
        }
        else {
            System.out.printf("This department does not exists");
        }
        return salary;
    }





    public String getDepartment() {
        return department;
    }

    public Double getWorkHours() {
        return workHours;
    }

    public Double getSalary() {
        return salary;
    }



    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWorkHours(Double workHours) {
        this.workHours = workHours;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", workHours=" + workHours +
                ", salary=" + salary +
                '}';
    }
}
