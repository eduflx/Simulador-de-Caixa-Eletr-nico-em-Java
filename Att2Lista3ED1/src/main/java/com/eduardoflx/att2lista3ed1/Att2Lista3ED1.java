/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eduardoflx.att2lista3ed1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Att2Lista3ED1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor (multiplo de 10): ");
        int valor = scanner.nextInt();

        // Notas de 50
        int notas50 = valor / 50;
        int resto = valor % 50;

        // Notas de 20
        int notas20 = resto / 20;
        resto = resto % 20;

        // Notas de 10
        int notas10 = resto / 10;

        System.out.println("Notas de R$ 50: " + notas50);
        System.out.println("Notas de R$ 20: " + notas20);
        System.out.println("Notas de R$ 10: " + notas10);

        scanner.close();
    }
}
