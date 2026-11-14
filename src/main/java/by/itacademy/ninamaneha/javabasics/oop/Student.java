package by.itacademy.ninamaneha.javabasics.oop;

public class Student extends User {
    private int grant;

    public Student(String name, int grant) {
        super(name);
        this.grant = grant;
    }

    public Student() {
        super();
    }

    public int getIncome() {
        if (grant != 0) {
            return grant;
        } else {
            return 0;
        }
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grant=" + grant +
                "} " + super.toString();
    }
}
