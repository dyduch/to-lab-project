package main;

public class D3 implements Employee {
    public Employee e;
    private int addition;

    public D3(Employee e, int addition) {
        this.e = e;
        this.addition = addition;
    }

    @Override
    public String showEmployee() {
        return e.showEmployee() + "\nAddition: " + this.addition;
    }

    public int getAddition() {
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }
}
