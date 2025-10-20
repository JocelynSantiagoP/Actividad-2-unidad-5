/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Mavenproject2 {

public static void main(String[] args) {} 

    public static void mostrarMenu() {
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-salir");
 }  
int n1, n2;
    public int sumar(Scanner sc) {
        return n1 + n2;
    }

    public double restar(Scanner sc) {
        return n1 - n2;
    }

    public int multiplicar(Scanner sc) {
        return n1 * n2;
    }

    public double dividir(Scanner sc) {
        return n1 / n2;
    }
        Scanner sc = new Scanner(System.in);
        System.out.println ("selecciona una opcion");
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-salir");
        op = sc.hasNextInt();
            
  switch (op){
        case 1 : 
         int resultado = sumar (sc);
            System.out.println("= "+resultado);
         break;
        case 2:
          double res = restar (sc);
            System.out.println("= "+res);
          break;
        case 3:
            int r = multiplicar (sc);
            System.out.println("= "+r);
            break;
        case 4:
            double rs = dividir (sc);
            System.out.println("= "+rs);
            break;
        case 5:
            System.out.println("saliendo");
        default:
            System.out.println("opcion no valida"); 
          }
         }while (op==5);
        }


    



 