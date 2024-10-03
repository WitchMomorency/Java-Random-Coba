    package com.mycompany.training;

import java.util.Scanner;

public class Training2 {
    int[][] data;

    public Training2(int totalRows, int[] sizes) {
        // Membuat array 2D dengan panjang baris totalRows
        // dan tiap baris memiliki panjang berbeda sesuai dengan sizes
        data = new int[totalRows][];
        for (int i = 0; i < totalRows; i++) {
            data[i] = new int[sizes[i]];
        }
    }

    // Mengisi matrix A dengan kelipatan 5
    public void fillMatrixA(int size) {
        int value = 5;
        for (int i = 0; i < size; i++) {
            data[0][i] = value;
            value += 5;
        }
    }

    // Mengisi matrix B dengan bilangan ganjil mulai dari 3
    public void fillMatrixB(int size) {
        int value = 3;
        for (int i = 0; i < size; i++) {
            data[1][i] = value;
            value += 2; // Ganjil bertambah 2
        }
    }

    // Mengisi matrix C dengan bilangan kuadrat mulai dari 2
    public void fillMatrixC(int size) {
        int value = 2;
        for (int i = 0; i < size; i++) {
            data[2][i] = value * value; // Bilangan kuadrat
            value++;
        }
    }

    // Mengisi matrix D dengan bilangan asli mulai dari 4
    public void fillMatrixD(int size) {
        int value = 4;
        for (int i = 0; i < size; i++) {
            data[3][i] = value;
            value++;
        }
    }

    // Menampilkan matrix
    public void printMatrix() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari angka dalam matrix
    public void searchValue(int target) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == target) {
                    System.out.println("Angka " + target + " ditemukan di baris " + i + " kolom " + j);
                    found = true;
                    count++;
                }
            }
        }
        if (found) {
            System.out.println("Angka " + target + " ditemukan sebanyak: " + count);
        }else{
             System.out.println("Angka " + target + " tidak ditemukan dalam matrix.");
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran untuk setiap matrix A-D
        System.out.print("Masukkan jumlah elemen untuk matrix A: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan jumlah elemen untuk matrix B: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan jumlah elemen untuk matrix C: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan jumlah elemen untuk matrix D: ");
        int d = scanner.nextInt();

        // Gabungkan ukuran tiap baris menjadi array ukuran
        int[] sizes = {a, b, c, d};

        // Buat object Training2
        Training2 matrix = new Training2(4, sizes);

        // Isi matrix A dengan kelipatan 5
        System.out.println("Mengisi matrix A dengan kelipatan 5:");
        matrix.fillMatrixA(a);

        // Isi matrix B dengan bilangan ganjil mulai dari 3
        System.out.println("Mengisi matrix B dengan bilangan ganjil mulai dari 3:");
        matrix.fillMatrixB(b);

        // Isi matrix C dengan bilangan kuadrat mulai dari 2
        System.out.println("Mengisi matrix C dengan bilangan kuadrat mulai dari 2:");
        matrix.fillMatrixC(c);

        // Isi matrix D dengan bilangan asli mulai dari 4
        System.out.println("Mengisi matrix D dengan bilangan asli mulai dari 4:");
        matrix.fillMatrixD(d);

        // Cetak seluruh matriks yang sudah digabung
        System.out.println("Matriks hasil:");
        matrix.printMatrix();

        // Pencarian angka dalam matrix
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        matrix.searchValue(target);

        scanner.close();
    }
}
