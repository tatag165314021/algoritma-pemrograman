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
public class PersKuadrat {

    public static void main(String[] args) {

        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);

        // Baca data koefisien persamaan dari keyboard
        System.out.println(" Koefisien x2 (a) : ");
        a = dataKuadrat.nextDouble();
        System.out.println(" Koefisien x (b)  : ");
        b = dataKuadrat.nextDouble();
        System.out.println(" Konstanta (c)    : ");
        c = dataKuadrat.nextDouble();

        // Hitung nilai D 
        D = b * b - (4 * a * c);

        if (D < 0) {// tidak punya akar real
            System.out.println("Tidak mempunyai akar nyata/real");
        } else if (D == 0) {// akarnya sama
            x1 = -b / (2 * a);
            System.out.println("Akarnya tunggal yakni : " + x1);
        } else {// akarnya dua berbeda
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Akar pertama : " + x1);
            System.out.println("Akar kedua   : " + x2);
        }
    }

}
