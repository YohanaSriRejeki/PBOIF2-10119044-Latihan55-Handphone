/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan55.handphone;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan berbagai macam merek handphone
 */

public class PBOIF210119044Latihan55Handphone {
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        System.out.println("Manufaktur : "+android.manufacture);
        System.out.println("OS : "+android.operatingSystem);
        System.out.println("Model : "+android.model);
        System.out.println("Harga : "+android.harga);
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : "+android.getKeyStore()+"\n");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        System.out.println("Manufaktur : "+bb.manufacture);
        System.out.println("OS : "+bb.operatingSystem);
        System.out.println("Model : "+bb.model);
        System.out.println("Harga : "+bb.harga);
        bb.setPinBB("BHS249");
        System.out.println("Pin : "+bb.getPinBB()+"\n");
        
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        System.out.println("Manufaktur : "+wp.manufacture);
        System.out.println("OS : "+wp.operatingSystem);
        System.out.println("Model : "+wp.model);
        System.out.println("Harga : "+wp.harga);
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : "+wp.getWpKeyStore()+"\n");
    }
}
