/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_14_05_2024;

/**
 *
 * @author Galang Anggara Putra
 */
public class ThrowDemo 
{
   public static void main(String[] args)
   {
       String input ="invalid input";
       try 
       {
           if(input.equals("invalid input"))
           {
               throw new MyException("input");
           }
           else
           {
               System.out.println(input);
           }
       }
       catch(RuntimeException ex)
       {
               System.out.println(ex.getMessage());
       }
       
   }
}