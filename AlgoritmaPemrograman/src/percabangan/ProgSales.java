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
public class ProgSales {

    public static void main(String[] args) {
        //buat objek scanner
        Scanner sc = new Scanner(System.in);
        //atribut dan variable 
        int jumPelanggan;
        double totalJual;

        System.out.println("Berapa banyak pelanggan ?");//input jumlah pelanggan
        jumPelanggan = sc.nextInt();
        System.out.println("Berapa total penjualan ?");//input total jual
        totalJual = sc.nextDouble();

        if (jumPelanggan > 25) // if pertama
        {
            System.out.println("Pesan makanan lebih banyak untuk besok \n");
        }

        if (totalJual >= 10000000) //if –else kedua, tidak berhubungan dengan if pertama
        {
            System.out.println("Cek kembali stock \n");
            System.out.println("Beri penghargaan untuk sales \n");
        } else {
            System.out.println("Pecat sales \n");
        }

        if ((jumPelanggan >= 50) && (totalJual >= 100000000)) //if ketiga, berdiri sendiri
        {
            System.out.println("Liburkan penjualan \n");
            System.out.println("Cek kembali stock \n");
        }
    }

}
