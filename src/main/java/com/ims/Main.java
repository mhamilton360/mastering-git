package com.ims;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 65);

        System.out.println(employee);
        System.out.println("=========================");

        for (int i = 1; i <= 5; i++) {
            if(i > 1) System.out.print(", ");
            System.out.print("i = " + i);
        }
    }
}