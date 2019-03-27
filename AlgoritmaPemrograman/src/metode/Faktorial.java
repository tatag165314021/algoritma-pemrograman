/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metode;

/**
 *
 * @author User
 */
public class Faktorial {

    public static void main(String[] args) {
        int hasilFaktorial;
        hasilFaktorial = faktorial(7);
        System.out.println("Hasil 7! adalah " + hasilFaktorial);
        System.out.println("Hasil 10! adalah " + faktorial(10));
    }

    static int faktorial(int n) {
        int hasFak = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i;
            }
        }
        return hasFak;
    }

}
