package com.mycompany.training;

import java.util.Scanner;

public class Training{
    // Fungsi Mainnya
    public static void main(String[] args){
        //Deklarasi variabel
        int ans;
        String num;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan yang ingin di konversi: ");
        num = scanner.nextLine();
        
        //Input kalau biner
        if(num.matches("[01]+")){
            ans = Integer.parseInt(num, 2);
            System.out.println("Setara Desimal biner " + num  + " adalah " + ans );
        //input kalau heksadesimal
        }else if(num.matches("[0-9A-Fa-f]+")){
            ans = Integer.parseInt(num, 16);
            System.out.println("Setara Desimal dari heksadesimal " + num + " adalah " + ans);
        }else{
            System.out.println("Input tidak valid. Masukan yang benar");
        }     
        scanner.close();
    }
}


