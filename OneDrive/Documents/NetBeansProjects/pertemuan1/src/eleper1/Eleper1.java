/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eleper1;

import java.util.Scanner;

public class Eleper1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data
        System.out.println("data:");
        System.out.print("nim: ");
        String nim = input.nextLine();
        
        System.out.print("nama: ");
        String nama = input.nextLine();
        
        System.out.print("nilai UTS: ");
        double uts = input.nextDouble();
        
        System.out.print("nilai UAS: ");
        double uas = input.nextDouble();
        
        // Hitung rata-rata
        double rata2 = (uts + uas) / 2;
        
        // Tentukan grade
        String grade;
        if (rata2 >= 85) {
            grade = "A";
        } else if (rata2 >= 70) {
            grade = "B";
        } else if (rata2 >= 55) {
            grade = "C";
        } else if (rata2 >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // Tampilkan tabel
        System.out.println("==================================");
        System.out.printf("%-5s %-8s %-6s %-6s %-6s %s%n", 
                          "Nim", "Nama", "UTS", "UAS", "Rata2", "Grade");
        System.out.println("==================================");
        System.out.printf("%-5s %-8s %-6.1f %-6.1f %-6.1f %s%n", 
                          nim, nama, uts, uas, rata2, grade);
    }
}