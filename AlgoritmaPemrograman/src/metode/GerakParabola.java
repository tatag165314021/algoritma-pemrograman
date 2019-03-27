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
public class GerakParabola {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        double tinggi, waktu, jarak, Vo, g = 10;
        System.out.print("Masukkan kecepatan awal : ");
        Vo = data.nextDouble();
        System.out.println("Sudut\t\t Waktu Tempuh\t\t\t Titik Tertinggi\t\t Jarak Terjauh");
        System.out.println("--------------------------------------------------------------------------------------------------------");

        for (double i = 5; i <= 90; i = i + 5) {
            double rad = i * Math.PI / 180;
            tinggi = tinggimaks(Vo, rad, g);
            waktu = Waktu(Vo, rad, g);
            jarak = Jarak(Vo, rad, g);
            System.out.println(i + "\t\t" + waktu + "\t\t" + waktu + "\t\t" + jarak);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    static double tinggimaks(double a, double b, double c) {
        return (((a * Math.sin(b)) * (a * Math.sin(b))) / (2 * c));
    }

    static double Waktu(double d, double e, double f) {
        return ((d * Math.sin(e)) / f);
    }

    static double Jarak(double g, double h, double i) {
        return (((g * g) * Math.sin(2 * h)) / g);
    }

}
