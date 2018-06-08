package main;

public class D2 implements Employee {
    public Employee e;
    private String workConditions;

    public D2(Employee e, String workConditions) {
        this.e = e;
        this.workConditions = workConditions;
    }

    @Override
    public String showEmployee() {
        return e.showEmployee() + "\nWork Conditions: " + this.workConditions;
    }

    public String getWorkConditions() {
        return workConditions;
    }

    public void setWorkConditions(String workConditions) {
        this.workConditions = workConditions;
    }
}
