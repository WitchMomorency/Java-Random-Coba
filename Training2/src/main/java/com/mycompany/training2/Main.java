package com.mycompany.training2;


public class Main{
    public static void main(String[] args){
        ProdiClass pri1 = new ProdiClass();
        pri1.setKode("IF");
        pri1.setNama("Informatika");
        MahasiswaClass mhs1 = new MahasiswaClass();
        mhs1.setNama("Putu Arjuna Nurgraha Eka Wana");
        mhs1.setNIM("1301223039");
        mhs1.setProdi(pri1);
        mhs1.setIPK(4.0);
        
        ProdiClass pri2 = new ProdiClass();
        pri2.setKode("SE");
        pri2.setNama("Sistem Informasi");
        MahasiswaClass mhs2 = new MahasiswaClass();
        mhs2.setNama("Budi Santoso");
        mhs2.setNIM("1302212568");
        mhs2.setProdi(pri2);
        mhs2.setIPK(3.5);
        
        ProdiClass pri3 = new ProdiClass();
        pri3.setKode("TI");
        pri3.setNama("Teknik Informatika");
        MahasiswaClass mhs3 = new MahasiswaClass();
        mhs3.setNama("Yoshino");
        mhs3.setNIM("130323456");
        mhs3.setProdi(pri3);
        mhs3.setIPK(2.0);
        
        ProdiClass pri4 = new ProdiClass();
        pri4.setKode("IF");
        pri4.setNama("Data Science");
        MahasiswaClass mhs4 = new MahasiswaClass();
        mhs4.setNama("Ahok");
        mhs4.setNIM("130122567");
        mhs4.setProdi(pri4);
        mhs4.setIPK(4.0);
        
        mhs1.displayMahasiswa();
        System.out.println();
        mhs2.displayMahasiswa();
        System.out.println();
        mhs3.displayMahasiswa();
        System.out.println();
        mhs4.displayMahasiswa();
        System.out.println();
    }

}
