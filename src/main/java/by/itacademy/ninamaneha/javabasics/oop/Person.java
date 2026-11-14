package by.itacademy.ninamaneha.javabasics.oop;

public class Person extends Student {
    private int salary;

    public Person(String name, int grant, int salary) {
        super(name, grant);
        this.salary = salary;
    }

    public Person() {
        super();
    }

    public int getIncome(){
        return super.getIncome() + salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
