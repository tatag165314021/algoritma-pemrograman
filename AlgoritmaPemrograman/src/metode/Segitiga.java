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
public class Segitiga {

    static int x1, x2, x3, y1, y2, y3;
    static int jarak;
    static double keliling, a, b, c, s, luas;

    public static void main(String[] args) {

        bacaTitik();
        a = hitungJarak(x1, y1, x2, y2);
        b = hitungJarak(x1, y1, x3, y3);
        c = hitungJarak(x2, y2, x3, y3);
        keliling = hitungKeliling(a, b, c);
        hitungLuas();

        System.out.println("Jarak a     : " + a);
        System.out.println("Jarak b     : " + b);
        System.out.println("Jarak c     : " + c);
        System.out.println("Keliling    : " + keliling);
        System.out.println("Luas        : " + luas);

    }

    static void bacaTitik() {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan X1 : ");
        x1 = data.nextInt();
        System.out.print("Masukkan X2 : ");
        x2 = data.nextInt();
        System.out.print("Masukkan X3 : ");
        x3 = data.nextInt();
        System.out.print("Masukkan Y1 : ");
        y1 = data.nextInt();
        System.out.print("Masukkan Y2 : ");
        y2 = data.nextInt();
        System.out.print("Masukkan Y3 : ");
        y3 = data.nextInt();

    }

    static int hitungJarak(int x1, int y1, int x2, int y2) {
        jarak = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return jarak;
    }

    static double hitungKeliling(double a, double b, double c) {
        keliling = a + b + c;
        return keliling;
    }

    static void hitungLuas() {
        s = (keliling / 2);
        luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
