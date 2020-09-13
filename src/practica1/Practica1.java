/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author mauricioceballos
 */
import java.util.Scanner;
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce Num1: ");
        int a = sc1.nextInt();
        
        System.out.println("Introduce Num2: ");
        int b = sc2.nextInt();
        //int a = 1;
        //int b = 2;
        double c = 0;
        
        c = a + b;
        
       
        System.out.println("Suma:" + c);
        
        c = a - b;
       
        System.out.println("Resta:" +c);
        
        c= a / b;
        System.out.println("Division:" +c);
        
        c= a * b;
        System.out.println("Multiplicacion:" +c);
        
    }
    
}
