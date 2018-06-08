package main;

import java.util.List;

public class RealEmployee implements Employee {
    private String name;
    private List<String> attributes;
    private int pension;

    public RealEmployee(String name, List<String> attributes, int pension) {
        this.name = name;
        this.attributes = attributes;
        this.pension = pension;
    }

    @Override
    public String showEmployee() {
        return "Employee:\n" +
                "Name: " + this.name +
                "\nAttributes: " + this.attributes.toString() +
                "\nPension: " + this.pension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }
}
