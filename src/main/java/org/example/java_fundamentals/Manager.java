package org.example.java_fundamentals;

public class Manager extends Person{

    private Double salary;
    private Double workHour;
    private final Double bonus = 10000.0;
    private Boolean target;


//    public Manager(String name, String lastName,Double workHour, Boolean target) {
////        super()
//        this.lastName = lastName;
//        this.workHour = workHour;
//        this.target = target;
//    }


    public Manager(String name, String lastName, Double workHour, Boolean target) {
        super(name, lastName);
        this.workHour = workHour;
        this.target = target;
    }
@Override
    public Double salary(){
        if(target){
            salary=workHour * 10 +bonus + super.salary();
        }
          else {
            salary = workHour * 10;
        }
        return salary;
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Double workHour) {
        this.workHour = workHour;
    }

    public Double getBonus() {
        return bonus;
    }

    public Boolean getTarget() {
        return target;
    }

    public void setTarget(Boolean target) {
        this.target = target;
    }
}
