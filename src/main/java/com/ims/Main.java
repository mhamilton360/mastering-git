package com.ims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 65);
        List<Employee> employees = Arrays.asList(employee, new Employee("Pete", 55));

        System.out.println(employee);
        System.out.println("=========================");

        for (int i = 1; i <= 5; i++) {
            if(i > 1) System.out.print(", ");
            System.out.print("i = " + i);
        }
        System.out.println("\n=========================");

        employees.forEach(System.out::println);
        System.out.println("\n=========================");
    }
}