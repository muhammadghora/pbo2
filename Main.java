package pbo2;

import Hewan;
import Manusia;
import PesawatTelepon;

public class Main {
    public static void main(String[] args) {
        Manusia org = new Manusia();
        PesawatTelepon telp = new PesawatTelepon();
        Hewan hwn = new Hewan();
        
        System.out.println("");
        System.out.println("--- Manusia ---");
        System.out.println("Saya suka bermain " + org.bermain("Sepak Bola dan Bulu Tangkis"));
        System.out.println("makanan favorit saya " + org.makan("Bakso"));
        org.tidur(true);
        System.out.println("saya bekerja " + org.bekerja("Sebagai Abdi Negara"));
        System.out.println("saya suka memasak " + org.memasak("Mie"));
        System.out.println("di weekend saya suka mencuci " + org.mencuci("Motor"));
        System.out.println("");
        System.out.println("--- Hewan ---");
        System.out.println("Kambing itu bermain " + hwn.bermain("di padang rumput"));
        System.out.println("suka makan " + hwn.makan("Rumput diladang"));
        hwn.tidur(true);
        System.out.println("");
        System.out.println("--- Pesawat Telepon ---");
        System.out.println("Saya menerima panggilan dari " + telp.terimaPanggilan("Atasan"));
        System.out.println("dan saya menelpon ke" + telp.melakukan_Panggilan("Ke rekan saya"));

    }

}
