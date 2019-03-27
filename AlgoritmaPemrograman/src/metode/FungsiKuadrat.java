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
public class FungsiKuadrat {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan a : ");
        int a = data.nextInt();
        System.out.print("Masukkan b : ");
        int b = data.nextInt();
        System.out.print("Masukkan c : ");
        int c = data.nextInt();

        System.out.println("Titik puncak        :(" + TitikPuncakXP(a, b, c) + "," + TitikPuncakYP(a, b, c) + ")");
        System.out.println("Titik potong Y    : (0," + TitikPotongY(a, b, c, 0) + ")");
        System.out.println("Titik potong X1  : (" + TitikPotongX1(a, b, c) + ",0)");
        System.out.println("Titik potong X2  : (" + TitikPotongX2(a, b, c) + ",0)");
        System.out.println("D                         : " + D(a, b, c));

        if (D(a, b, c) < 0) {
            System.out.println("Tidak mempunyai Titik Potong X");
        } else if (D(a, b, c) == 0) {
            System.out.println("Mempunyai satu titik potong X");
        } else {
            System.out.println("Mempunyai dua titik potong X");
        }
    }

    static double f(int a, int b, int c, double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }

    static double D(int a, int b, int c) {
        double D;
        return D = Math.pow(b, 2) - (4 * a * c);
    }

    static double TitikPotongY(int a, int b, int c, int val) {
        return f(a, b, c, val);
    }

    static double TitikPotongX1(int a, int b, int c) {
        double x1;
        return x1 = (-b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
    }

    static double TitikPotongX2(int a, int b, int c) {
        double x2;
        return x2 = (-b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
    }

    static double TitikPuncakXP(int a, int b, int c) {
        double xp;
        return xp = (-b) / (2 * (a));
    }

    static double TitikPuncakYP(int a, int b, int c) {
        double yp;
        return yp = D(a, b, c) / (-4 * (a));
    }
}
