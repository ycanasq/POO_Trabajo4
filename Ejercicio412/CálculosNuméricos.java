/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo4_ep412;
import java.util.*;
/**
 *
 * @author MacBook
 */
public class CálculosNuméricos {
    public static double calcularLogaritmoNeperiano(double valor) {
        double resultado = 0;
        try {
            if (valor < 0) { 
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            return Math.log(valor);
        } 
        catch (ArithmeticException e) {
            System.out.println("El valor debe ser un número positivo para calcular el logaritmo");
            return resultado;
        } 
        catch (InputMismatchException e) {
            System.out.println("El valor debe ser numérico para calcular el logaritmo");
            return resultado;
        }
    }
    
    public static double calcularRaízCuadrada(double valor) {
        double resultado = 0;
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            return Math.sqrt(valor);
        }
        catch (ArithmeticException e) {
            System.out.println("El valor debe ser un número positivo para calcular la raíz cuadrada");
            return resultado;
        }
        catch (InputMismatchException e) {
            System.out.println("El valor debe ser numérico para calcular la raíz cuadrada");
            return resultado;
        }
    }
}
