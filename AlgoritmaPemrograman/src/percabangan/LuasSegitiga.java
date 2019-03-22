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
public class LuasSegitiga {

    public static void main(String[] args) {
        Scanner dataSegitiga = new Scanner(System.in);

        int alas, tinggi;// deklarasi variabel untuk alas, tinggi, luas segitiga
        double luas;

        System.out.print("Masukkan alas segitiga: "); // meminta user memasukkan data alas
        alas = dataSegitiga.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");// meminta user memasukkan data tinggi
        tinggi = dataSegitiga.nextInt();

        luas = 0.5 * alas * tinggi; // menghitung luas

        System.out.println("Segitiga dengan alas  :" + alas);
        System.out.println("dan tingginya : " + tinggi);
        System.out.println("mempunyai luas = " + luas);

    }
}
