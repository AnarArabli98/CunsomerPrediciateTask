/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumertask;

/**
 *
 * @author anara
 */
public class Employeesual1 {
    private String id;
    private double salary;
    private String name;

    public Employeesual1(String id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employeesual1{" + "id=" + id + ", salary=" + salary + ", name=" + name + '}';
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
