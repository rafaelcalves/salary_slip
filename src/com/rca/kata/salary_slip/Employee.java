package com.rca.kata.salary_slip;

public class Employee {
    private int id;
    private String name;
    private double anualGrossSalary;

    public Employee(int id, String name, double anualGrossSalary) {
        this.id = id;
        this.name = name;
        this.anualGrossSalary = anualGrossSalary;
    }

    public double getAnualGrossSalary() {
        return anualGrossSalary;
    }
}
