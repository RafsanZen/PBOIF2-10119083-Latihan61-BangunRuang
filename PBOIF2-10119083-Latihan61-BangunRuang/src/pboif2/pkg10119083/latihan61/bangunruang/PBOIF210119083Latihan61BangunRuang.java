/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan61.bangunruang;

/**
 *
 * NAMA        : Rafsam Zen Mustaofa
 * KELAS       : PBOIF2
 * NIM         : 10119083
 * Deskripsi   : program bangun ruang
 */
public class PBOIF210119083Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        b.tampilHasil();
        Tabung t = new Tabung(10,21);
        t.tampilHasil();
        Kerucut k = new Kerucut(14,9);
        k.tampilHasil();
    }
    
}
