package task2;

import task2.Person;

public class Lecturer extends Person {

    protected String specialization;
    protected int salary;

    public Lecturer(String name, String address, String specialization, int salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }



    @Override
    public String toString(){
        return name+" live in "+address+". He/She is on "+ specialization+ ". Him/her salary is "+ salary + " USD.";
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
