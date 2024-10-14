package com.mycompany.training3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat Mahasiswa
        Mahasiswa[] mhsArray = new Mahasiswa[3];
        mhsArray[0] = new Mahasiswa("Momon", "1301223039", 8); // Angkatan 2022
        mhsArray[1] = new Mahasiswa("Jamal", "1301214507", 7); // Angkatan 2021
        mhsArray[2] = new Mahasiswa("Asep", "1301204406", 6);  // Angkatan 2020

        // Membuat MataKuliah
        MataKuliah kalkulus = new MataKuliah("Kalkulus", 3);
        MataKuliah alpro = new MataKuliah("Alpro", 4);

        // Membuat AmbilMK (data nilai)
        AmbilMK[] mkArray = new AmbilMK[6];
        mkArray[0] = new AmbilMK(mhsArray[0], kalkulus, "21/22", 4.0); // A
        mkArray[1] = new AmbilMK(mhsArray[0], alpro, "21/22", 4.0);    // A
        mkArray[2] = new AmbilMK(mhsArray[1], kalkulus, "20/21", 3.0); // B
        mkArray[3] = new AmbilMK(mhsArray[1], alpro, "20/21", 3.0);    // B
        mkArray[4] = new AmbilMK(mhsArray[2], kalkulus, "19/20", 3.5); // AB
        mkArray[5] = new AmbilMK(mhsArray[2], alpro, "19/20", 3.5);    // AB

        // Mengambil input user
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan Tahun Akademik (format '21/22', atau 'q' untuk keluar): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            int angkatanInput = Mahasiswa.convertInputToAngkatan(input);
            if (angkatanInput == -1) {
                System.out.println("Format tahun akademik tidak valid.");
                continue;
            }

            boolean found = false;
            for (Mahasiswa mhs : mhsArray) {
                if (mhs.getAngkatan() == angkatanInput) {
                    double ipk = mhs.getIPK(mkArray, input);
                    if (ipk >= 0) {
                        System.out.printf("%s (%s) IPK: %.2f\n", mhs.getNama(), mhs.getKelas(), ipk);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("Tidak ditemukan data untuk angkatan tersebut.");
            }
        }
    }
}