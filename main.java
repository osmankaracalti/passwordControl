package com.company;
import java.util.Scanner;
import java.lang.Character;
public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz:");
        String sifre = klavye.nextLine();
        gecerliMi(sifre);
    }
    static String gecerliMi(String sifre) {
        boolean sonuc=false;
        String mesaj="...";
        int harfSayac=0;
        int rakamSayac=0;

        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isLetter(sifre.charAt(i))){
                sonuc = true;
                harfSayac++;
            }
            else if (Character.isDigit(sifre.charAt(i))){
                sonuc = true;
                rakamSayac++;
            }
            else {
                sonuc = false;
                System.out.println("Geçersiz karakter girdiniz!");
                break;
            }
        }
        if (sifre.length() < 8) {
            sonuc=false;
            System.out.println("En az 8 karakter giriniz.");
        }
        if (rakamSayac<2){
            sonuc=false;
            System.out.println("En az 2 rakam giriniz!");
        }
        if (harfSayac<1){
            sonuc = false;
            System.out.println("En az 1 harf giriniz. ");
        }
        if (sonuc==true){
            mesaj="Şifre Geçerlidir.";
            System.out.println(mesaj);
        }
        else {
            mesaj="Şifre Geçerli Değildir!";
            System.out.println(mesaj);
        }

        return mesaj;
    }
}