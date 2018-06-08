package main;

public class D1 implements Employee{

    public Employee e;
    private String position;

    public D1(Employee e, String position) {
        this.e = e;
        this.position = position;
    }

    @Override
    public String showEmployee() {
            return e.showEmployee() + "\nPosition: " + this.position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
