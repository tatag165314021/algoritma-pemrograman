/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Buatlah program untuk mengecek apakah bilangan yang dimasukkan merupakan bilangan ganjil atau genap 
        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL ATAU GENAP");
        //buat variable dan atribut
        int bilangan;
        //buat objek scanner
        Scanner input = new Scanner(System.in);
        //masukkan variable kedalam scanner
        System.out.println("Masukkan bilangan : ");
        bilangan = input.nextInt();
        //jika sisa hasil bagi 2 samadengan nol maka genap
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan : "+bilangan+" adalah Genap");           
        }
        //selain itu ganjil
        else{
            System.out.println("Bilangan : "+bilangan+" adalah Ganjil");
        }

    }

}
