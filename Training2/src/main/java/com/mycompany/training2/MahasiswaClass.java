package com.mycompany.training2;


public class MahasiswaClass{
    private String nama;
    private String NIM;
    private ProdiClass prodi;
    private double IPK;
    private int angkatan;

    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
        
        setAngkatan();
    }
    
   public void setAngkatan(){
        String angkatanStr = this.NIM.substring(4, 6);
        int tahun = Integer.parseInt(angkatanStr);
        
        if(tahun >= 0 && tahun <= 24){
            this.angkatan = 2000 + tahun;
        }else if(tahun >= 90 && tahun <= 99){
            this.angkatan = 1900 + tahun;
        }else{
            System.out.println("Tahun angkatan tidak valid.");
            this.angkatan = -1;
        }
    }
    public String getNIM(){
        return this.NIM;
    }
    
    public int getAngkatan(){
        return this.angkatan;
    }
    
    public void setProdi(ProdiClass prodi){
        String nimPrefix = this.NIM.substring(0, 4);
        
        if(nimPrefix.equals("1301") && prodi.getNama().equals("Informatika") && prodi.getKode().equals("IF")){
            this.prodi = prodi;
        }else if(nimPrefix.equals("1302") && prodi.getNama().equals("Sistem Informasi") && prodi.getKode().equals("SE")){
            this.prodi = prodi;
        }else if(nimPrefix.equals("1303") && prodi.getNama().equals("Teknik Informatika") && prodi.getKode().equals("TI")){
            this.prodi = prodi;
        }else if(nimPrefix.equals("1305") && prodi.getNama().equals("Data Science") && prodi.getKode().equals("DS")){
            this.prodi = prodi;
        }else{
            System.out.println("Prodi tidak termasuk dalam list! , prodi tidak dapat di set!");
            this.prodi = null;
        }
    }
    
    public ProdiClass getProdi(){
        return this.prodi;
    }
    
    public void setIPK(double IPK){
        this.IPK = IPK;
    }
    
    public double getIPK(){
        return this.IPK;
    }
  
    
    public String getstatusKelulusan(){
        if(IPK == 4.0){
            return "Cum Laude";
        }else if(IPK >= 3.5){
            return "Sangat Baik";
        }else if(IPK >= 3.0){
            return "Baik";
        }else if(IPK >= 2.0){
            return "Cukup";
        }else {
            return "Kurang";
        }
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama: " + this.getNama());
        System.out.println("NIM: " + this.getNIM());
        if(this.getProdi() != null){
            System.out.println("Nama Prodi: " + this.getProdi().getNama());
            System.out.println("Kode jurusan: " + this.getProdi().getKode());
        }else{
            System.out.println("Nama prodi: belum ditentukan.");
        }
        System.out.println("IPK: " + this.getIPK());
        
        if(this.getAngkatan() == -1){
            System.out.println("Angkatan: Tahun tidak valid.");
        }else{
            System.out.println("Angkatan: " + this.getAngkatan());
        }
        
        System.out.println("Status Kelulusan: " + this.getstatusKelulusan());
    }
    
}