/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumertask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author anara
 */
public class Sual1Sual2 {
    public static void main(String[] args) {
        
        List<Employeesual1> isciler = new ArrayList<>();
        isciler.add(new Employeesual1("1",1200,"Anar"));
        isciler.add(new Employeesual1("2",1205,"Samir"));
        isciler.add(new Employeesual1("3",999,"Arzu"));
        isciler.add(new Employeesual1("4",1000,"Anarrrr"));
        
       List<Employeesual1> emplo = isciler.stream().filter(emp).collect(Collectors.toList());
        
       emplo.forEach(System.out::println);
       emplo.forEach(empl);
       
    }
    static Predicate<Employeesual1> emp = employees -> employees.getSalary()>1000;
     
    
//sual 2
    
    static Consumer<Employeesual1> empl = emp1 -> System.out.println(emp1);;
    
     
    
    
}
