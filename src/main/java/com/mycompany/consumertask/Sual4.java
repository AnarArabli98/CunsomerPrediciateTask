/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumertask;

import java.util.Scanner;

/**
 *
 * @author anara
 */
public class Sual4 implements CalculatorSual4 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a =sc.nextInt();
//        double b = sc.nextInt();
    
        CalculatorSual4 topla = (a, b) -> a + b;
        CalculatorSual4 cixma = (a, b) -> a - b;
        CalculatorSual4 vurma = (a, b) -> a * b;
        CalculatorSual4 bolme = (a, b) -> {
            if (b == 0) {
                System.out.println("0 bolmek olmaz");
            }
            return a / b;
        };
    }

    @Override
    public double calculate(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
