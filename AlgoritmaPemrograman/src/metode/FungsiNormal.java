/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metode;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FungsiNormal {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan n : ");
        int n = data.nextInt();
        for (double z = -4; z <= 4; z = z + 0.5) {
            int jumbin = normal(n, z);
            bintang(jumbin);
        }
    }

    static int normal(int n, double z) {
        double f = (1 / (Math.sqrt(2 * Math.PI))) * (Math.pow(2.71828, (-0.5) * z * z));
        return (int) Math.round(n * f);
    }

    static void bintang(int m) {
        for (int i = 1; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}
