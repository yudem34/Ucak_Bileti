package Ucak_Bileti;

import java.util.Scanner;

public class Bilet_Fiyati_Hesaplama {
    public static void main(String[] args) {
    /*
    A sehrinden ucmak isteyen yolcu B sehrine 500 km,C sehrine 700km, D sehrine 900 km mesafededir
    Bilet Tarifesi
    Km birim fiyati : 0,10$
    yolcu 12 yasından kucukse toplam fiyat uzerinden %30 indirim
    12 ve 24 yas arsı ıse %10
    65 yasından buyukse %30
    Bilet gidis donus alınırsa %20 indirim uygulayın
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba QA Bilet Uygulamasına Hosgeldiniz");
        int secim;
        int yon;
        int yas;
        do {
            System.out.println("Lutfen gitmek istediginiz sehri seciniz");
            System.out.println("B Sehri : 1\n" + "C Sehri : 2\n" + "D Sehri : 3");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    do {
                        System.out.println("Tek Yon : 1\n" + "Gidis-Donus : 2");
                        yon = scan.nextInt();
                        if (yon == 1) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (500 * 0.10 * 0.7) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (500 * 0.10 * 0.9) + " $");
                            } else {
                                System.out.println("Toplam : " + (500 * 0.10) + " $");
                            }
                        } else if (yon == 2) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.7 * 0.8) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.9 * 0.8) + " $");
                            } else {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.8) + " $");
                            }
                        }
                    } while (yon >= 3 || yon <= 0);
                    break;
                case 2:
                    do {
                        System.out.println("Tek Yon : 1\n" + "Gidis-Donus : 2");
                        yon = scan.nextInt();
                        if (yon == 1) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (700 * 0.10 * 0.7) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (500 * 0.10 * 0.9) + " $");
                            } else {
                                System.out.println("Toplam : " + (500 * 0.10) + " $");
                            }
                        } else if (yon == 2) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (2 * 700 * 0.10 * 0.7 * 0.8) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.9 * 0.8) + " $");
                            } else {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.8) + " $");
                            }
                        }
                    } while (yon >= 3 || yon <= 0);
                    break;
                case 3:
                    do {
                        System.out.println("Tek Yon : 1\n" + "Gidis-Donus : 2");
                        yon = scan.nextInt();
                        if (yon == 1) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (900 * 0.10 * 0.7) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (500 * 0.10 * 0.9) + " $");
                            } else {
                                System.out.println("Toplam : " + (500 * 0.10) + " $");
                            }
                        } else if (yon == 2) {
                            System.out.println("Lutfen yasınızı giriniz");
                            yas = scan.nextInt();
                            if (yas < 12 || yas > 65) {
                                System.out.println("Toplam : " + (2 * 900 * 0.10 * 0.7 * 0.8) + " $");
                            } else if (yas > 12 && yas < 24) {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.9 * 0.8) + " $");
                            } else {
                                System.out.println("Toplam : " + (2 * 500 * 0.10 * 0.8) + " $");
                            }
                        }
                    } while (yon >= 3 || yon <= 0);
            }
        } while (secim >= 4);
    }
}
