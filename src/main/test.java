package main;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String... args){

        List<String> attributes = new ArrayList<>();
        String height = "183 cm";
        String weight = "88 kg";
        String eyeColor = "Blue eyes";
        attributes.add(height);
        attributes.add(weight);
        attributes.add(eyeColor);
        Employee employee =  new RealEmployee("Kszysiek Jarzyna", attributes, 2950);
        System.out.println(employee.showEmployee());

        Employee employee1 = new D1(employee, "CEO");
        System.out.println("\nD1:\n" + employee1.showEmployee());

        Employee employee2 = new D2(employee, "Very Bad");
        System.out.println("\nD2:\n" + employee2.showEmployee());

        Employee employee3 = new D3(employee, 430);
        System.out.println("\nD3:\n" + employee3.showEmployee());
    }
}
