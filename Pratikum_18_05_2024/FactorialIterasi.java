/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_18_05_2024;

/**
 *
 * @author Galang Anggara Putra
 */
public class FactorialIterasi {
    
    static int factorial(int n){
        int result = 1;
        for(int i = n; i > 1; i--){
            result *=i;
        }
        return result;
    }
    
    
    public static void main(String[] args){
        int n = 4;
        System.out.println(factorial(n));
    }
    
}