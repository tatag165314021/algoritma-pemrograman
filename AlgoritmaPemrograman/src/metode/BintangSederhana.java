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
public class BintangSederhana {

    public static void main(String[] args) {
        bintang(5);// 5 bintang
        bintang(7);//7 bintang
        bintang(10);//10 bintang
    }

    static void bintang(int n) {
        System.out.print(n + " bintang : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
    }

}
