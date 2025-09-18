/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.speeding;

/**
 *
 * @author jerem
 */
import java.util.Scanner;
public class Speeding {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter citizen Name:");
            String citizenName = scanner.nextLine();
            
            System.out.print("Enter the speed :");
            double speed = scanner.nextDouble();
            
            Fine fine = new Fine(citizenName,speed);
            
            fine.printFine();
        }
    }
}
