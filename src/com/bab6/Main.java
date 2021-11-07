package com.bab6;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader nilai= new BufferedReader(new InputStreamReader(System.in));

        int pilihan;
        int pertama;
        int kedua;
        int ketiga;
        String nilai1 = " ";
        String nilai2 = " ";
        String nilai3 = " ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Nilai\n2.Membaca Bilangan\n3.Cetak Seratus kali\n4.Perpangkatan");
        System.out.print("Masukan Pilihan :");
        int pilih = scanner.nextInt();

        switch (pilih){
            case 1 :
                System.out.println("1.Menggunakan BuffredReader\n2.Menggunakan JOptionePane");
                System.out.println("Masukan Pilihan :");
                pilihan = scanner.nextInt();

                switch (pilihan){
                    case 1 :
                        try {
                            System.out.println("Masukan Nilai pertama :");
                            nilai1 = nilai.readLine();
                            System.out.println("Masukan Nilai kedua   :");
                            nilai2 = nilai.readLine();
                            System.out.println("Masukan Nilai ketiga  :");
                            nilai3 = nilai.readLine();
                        }catch (IOException e){
                            System.out.println("Nilai yang anda masukan salah");
                        }
                        pertama = Integer.parseInt(nilai1);
                        kedua   = Integer.parseInt(nilai2);
                        ketiga  = Integer.parseInt(nilai3);

                        float rata_rata =(pertama+kedua+ketiga) / 3;
                        System.out.println("Rata-rata nilai anda : " + rata_rata);

                        if (rata_rata <= 60){
                            System.out.println(":-(");
                        }else {
                            System.out.println(":-)");
                        }
                        break;

                    case 2 :
                        nilai1 = JOptionPane.showInputDialog("Masukan Nilai Pertama :");
                        pertama= Integer.valueOf(nilai1);
                        nilai2 = JOptionPane.showInputDialog("Masukan Nilai Kedua   :");
                        kedua  = Integer.valueOf(nilai2).intValue();
                        nilai3 = JOptionPane.showInputDialog("Masukan Nilai Ketiga  :");
                        ketiga = Integer.valueOf(nilai3).intValue();
                        float rata = (pertama+kedua+ketiga)/3;

                        String hasil =" ";
                        hasil += "Nilai pertama : " + pertama + "\n";
                        hasil += "Nilai kedua   : " + kedua   + "\n";
                        hasil += "Nilai ketiga  : " + ketiga  + "\n";
                        hasil += "Rata - rata   : " + rata    + "\n";

                        if(rata <= 60) {
                            hasil += ":-(" + "\n";
                        }else {
                            hasil += ":-)" + "\n";
                        }
                        JOptionPane.showMessageDialog(null,hasil);
                        break;
                }
                break;

            case 2 :
                System.out.print("Masukan Angka :");
                int angka = scanner.nextInt();
                System.out.println("1.Menggunakan If ELse\n2.Menggunakan Switch case");
                System.out.print("Masukan Pilihan :");
                pilih = scanner.nextInt();
                switch (pilih){
                    case 1 :
                        System.out.println("Menggunakan If Else");
                        if(angka >= 1 & angka <= 10){
                            System.out.println("angka " + angka);
                        }else {
                            System.out.println("Angka Invalid");
                        }
                        break;

                    case 2 :
                        switch (angka) {
                            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                                System.out.print("Angka " +angka);
                                break;
                            default:
                                System.out.println("angka invalid");
                                break;
                        }

                    default:
                        System.out.println("Pilihan Invalid");
                        break;
                }

            case 3 :

                String nama = "";

                System.out.println("1.For Loop\n2.While Loop\n3.Do While Loop");
                System.out.print("Masukan Pilihan :");
                int option = scanner.nextInt();

                System.out.println("Masukan Nama :");
                try {
                    nama = nilai.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(option == 1) {
                    System.out.println("Menggunakan For");
                    for (int i = 1; i <= 100; i++) {
                        System.out.println(nama);
                    }
                }
                else if (option == 2){
                    System.out.println("Menggunakan While");
                    int i = 1;
                    while (i <= 100){
                        System.out.println(nama);
                        i++;
                    }
                }
                else if (option == 3){
                    System.out.println("Menggunakan Do While");
                    int i = 1;
                    do {
                        System.out.println(nama);
                        i++;
                    }while (i <= 100);
                }
                else {
                    System.out.println("Pilihan Invalid");
                }
                break;

            case 4 :
                System.out.print("Masukan bilangan berpangkat :");
                int bil = scanner.nextInt();
                System.out.print("Masukan banyak pangkat      :");
                int pangkat = scanner.nextInt();

                int hasil = (int) Math.pow(bil,pangkat);

                System.out.println("Hasil Perpangkatan dari " + bil + "^" + pangkat + " = " + hasil);
                break;

            default:
                System.out.println("Pilihan Invalid");
        }
    }
}