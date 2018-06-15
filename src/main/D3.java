package main;

public class D3 implements Employee {
    public Employee e;
    private int bonus;

    public D3(Employee e, int bonus) {
        this.e = e;
        this.bonus = bonus;
    }

    @Override
    public String showEmployee() {
        return e.showEmployee() + "\nBonus: " + this.bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
