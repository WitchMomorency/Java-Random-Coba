package com.mycompany.training3;

class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;

    public Mahasiswa(String nama, String nim, int no_kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = setKelas(no_kelas);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    // Menggabungkan kode Prodi, angkatan, dan nomor kelas
    private String setKelas(int no_kelas) {
        String prodi = getProdi(); // Mendapatkan kode Prodi berdasarkan NIM
        int angkatanNumber = (getAngkatan() % 100) + 24; // Mendapatkan dua digit terakhir angkatan
        return prodi + "-" + angkatanNumber + "-" + String.format("%02d", no_kelas);
    }

    // Mengembalikan kode Prodi berdasarkan NIM
    public String getProdi() {
        String kodeProdi = nim.substring(0, 4);
        switch (kodeProdi) {
            case "1301":
                return "IF"; // Informatika
            case "1302":
                return "SI"; // Sistem Informasi
            case "1303":
                return "TI"; // Teknik Informatika
            case "1305":
                return "DS"; // Data Science
            default:
                return "ProdiTidakValid";
        }
    }

    // Mengembalikan angkatan sebagai tahun masuk, misalnya 2022
    public int getAngkatan() {
        String angkatanStr = this.nim.substring(4, 6);
        int angkatan = Integer.parseInt(angkatanStr);
        // Misalnya, jika angkatan adalah 22, maka tahun masuk adalah 2022
        if (angkatan >= 0 && angkatan <= 99) {
            return 2000 + angkatan;
        } else {
            System.out.println("Tahun angkatan tidak valid.");
            return -1;
        }
    }

    // Method untuk mengonversi input tahun akademik menjadi angkatan (tahun masuk)
    public static int convertInputToAngkatan(String tahunAkademik) {
        String[] parts = tahunAkademik.split("/");
        if (parts.length != 2) {
            return -1;
        }
        try {
            int tahun1 = Integer.parseInt("20" + parts[0]);
            return tahun1 + 1; // Kita akan menganggap tahun masuk adalah tahun1 + 1
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Method untuk menghitung IPK mahasiswa
    public double getIPK(AmbilMK[] mkArray, String tahunAkademik) {
        double totalSks = 0;
        double totalNilai = 0;
        for (AmbilMK mk : mkArray) {
            if (mk.getMahasiswa().equals(this) && mk.getTahun().equals(tahunAkademik)) {
                totalSks += mk.getMataKuliah().getSks();
                totalNilai += mk.getIndexNilai() * mk.getMataKuliah().getSks();
            }
        }
        return totalSks > 0 ? totalNilai / totalSks : -1;
    }
}
