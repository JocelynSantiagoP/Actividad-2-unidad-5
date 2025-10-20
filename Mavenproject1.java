/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Mavenproject1 {

 
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int opcion;
  do {
  mostrarMenu();
  System.out.print("Seleccione una opción: ");
  opcion = sc.nextInt();

  switch (opcion) {
  case 1:
  sumar(sc);
  break;
  case 2:
  restar(sc);
  break;
  case 3:
  multiplicar(sc);
  break;
  case 4:
  dividir(sc);
  break;
  case 5:
  System.out.println("Saliendo de la calculadora.");
  break;
  default:

  System.out.println("Opción no válida. Intente de nuevo.");
  }
  } while (opcion != 5);
  sc.close();
  }

 

  public static void mostrarMenu() {

  System.out.println("\nCalculadora Básica");
  System.out.println("1. Sumar");
  System.out.println("2. Restar");
  System.out.println("3. Multiplicar");
  System.out.println("4. Dividir");
  System.out.println("5. Salir");
  }
  
  


  public static void sumar(Scanner sc) {
      System.out.println("captura los numeros");
 double n1= sc.nextDouble();
 double n2 = sc.nextDouble();
  double resultado = n1 + n2;
  System.out.println("Resultado: " + resultado);
  }

 

  public static void restar(Scanner sc) {
          System.out.println("captura los numeros");
  double n1= sc.nextDouble();
  double n2 = sc.nextDouble();
  double resultado = n1 - n2;
  System.out.println("Resultado: " + resultado);

  }

 

  public static void multiplicar(Scanner sc) {
          System.out.println("captura los numeros");
    double n1= sc.nextDouble();
   double n2 = sc.nextDouble();
   double resultado = n1 * n2;
 System.out.println("Resultado: " + resultado);

  }

 

  public static void dividir(Scanner sc) {
        System.out.println("captura los numeros");
   double n1= sc.nextDouble();
   double n2 = sc.nextDouble();
   double resultado = n1 / n2;

  System.out.println("Resultado: " + resultado);

  }

  }


