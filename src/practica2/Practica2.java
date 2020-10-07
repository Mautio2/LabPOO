/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author mauricioceballos
 */
import java.util.Scanner;

public class Practica2{


	public static void main(String[] args){
		Scanner num1= new Scanner(System.in);
		Scanner num2= new Scanner(System.in);

		System.out.println("Ingresa el primer valor: ");
		double a= num1.nextDouble();
		System.out.println("Ingresa el segundo valor: ");
		double b= num2.nextDouble();

		//utilizando metodos
		System.out.println("\n\nUtilizando metodos: \n");
		Calculadora objCal= new Calculadora();
		
		double suma= objCal.sumar(a, b, false);
		double resta= objCal.restar(a, b, false);
		double multiplicacion= objCal.multiplicar(a, b, false);
		double division= objCal.dividir(a,b, false);

		System.out.println("suma: " +suma);
		System.out.println("resta: " +resta);
		System.out.println("multiplicacion: " +multiplicacion);
		System.out.println("division: " +division);

		

		//utilzando contructor
		System.out.println("\n\nUtilizando el contructor: \n");
		Calculadora objCal2= new Calculadora(a,b, true);
	}
}