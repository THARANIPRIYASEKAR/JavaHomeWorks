package org.example.e196;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E196Map {

    public static void main(String[] args) {

        //Initialize a Map<String, List<String>> to store departments and employees
        Map<String, List<String>> departmentEmployees = new LinkedHashMap<>();

        //Add Employees to Each ArrayList
        ArrayList<String> hr = new ArrayList<>();
        hr.add("Alice");
        hr.add("Bob");

        ArrayList<String> it = new ArrayList<>();
        it.add("Charlie");
        it.add("David");
        it.add("Eve");

        ArrayList<String> finance = new ArrayList<>();
        finance.add("Frank");
        finance.add("Grace");

        // Add the Employee Lists to the Map
        departmentEmployees.put("HR", hr);
        departmentEmployees.put("IT", it);
        departmentEmployees.put("Finance", finance);

        //Print Each Department and Employees
        departmentEmployees.forEach((k, v) -> {
            System.out.print("Department: " + k + " ");
            System.out.print("Employees: " + v);
            System.out.println();
        });

        departmentEmployees.forEach((k,v) -> System.out.println(k));

        System.out.println("All Employees: ");
        departmentEmployees.forEach((k, v) -> {
            v.forEach(x-> System.out.println(x));
        });

    }
}


