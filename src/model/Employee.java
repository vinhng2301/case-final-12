package model;

public class Employee {

    private int id;
    private String name;
    private float salary;
    private int workhour;
    private float totalSalary;

    public Employee(int id, String name, float salary, int workhour, float totalSalary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.workhour = workhour;
        this.totalSalary = totalSalary;
    }

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkhour() {
        return workhour;
    }

    public void setWorkhour(int workhour) {
        this.workhour = workhour;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
}
