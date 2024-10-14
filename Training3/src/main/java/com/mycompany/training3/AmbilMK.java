package com.mycompany.training3;

class AmbilMK {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private String tahun;
    private double nilai;

    public AmbilMK(Mahasiswa mahasiswa, MataKuliah mataKuliah, String tahun, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.tahun = tahun;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public String getTahun() {
        return tahun;
    }

    public double getNilai() {
        return nilai;
    }

    public double getIndexNilai() {
        if (nilai >= 4.0) {
            return 4.0; // A
        } else if (nilai >= 3.5) {
            return 3.5; // AB
        } else if (nilai >= 3.0) {
            return 3.0; // B
        } else if (nilai >= 2.5) {
            return 2.5; // BC
        } else if (nilai >= 2.0) {
            return 2.0; // C
        } else {
            return 0.0; // D atau E
        }
    }
}