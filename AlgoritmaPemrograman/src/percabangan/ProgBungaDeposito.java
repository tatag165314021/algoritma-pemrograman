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
public class ProgBungaDeposito {

    public static void main() {
        double deposito, bunga; // variable untuk menyimpan data deposito dan bunganya

        Scanner dataBank = new Scanner(System.in);

        System.out.print("Masukkan jumlah deposito Anda: ");//pemasukan data deposito
        deposito = dataBank.nextDouble();

        if (deposito >= 50000000) { // perhitungan bunga dng syarat besarnya deposito
            bunga = 0.01 * deposito; // jika deposito lebih dari 50 juta
        } else {
            bunga = 0.0075 * deposito; // jika deposito kurang dari 50 juta
        }
        System.out.println("Bunga deposito Anda per bulan adalah Rp " + bunga);//cetak bunga

    }

}
