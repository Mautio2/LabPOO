/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author mauricioceballos*/
import java.util.Scanner;
public class Practica3 {

    /**
     public static void main(String[] args) {
    * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tvSamsung = new Television();
        Scanner ch = new Scanner(System.in);      
        
        tvSamsung.Encender();
        
        
        System.out.println(tvSamsung.ConfigMenu());
        System.out.println("Que canal quieres? ");
        System.out.println(tvSamsung.CambiarCanal(ch.nextInt()));
        System.out.println("Que volumen quieres? ");
        System.out.println(tvSamsung.Volumen(ch.nextInt()));
        System.out.println(tvSamsung.Autodestruir());
        System.out.println(tvSamsung.Apagar());
        
        // TODO code application logic here
    }
    
}
