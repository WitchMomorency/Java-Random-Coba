package com.mycompany.training;

import java.util.Scanner;

public class Matrix2D{
       int[][] data;
       
       public Matrix2D(int totalrows, int[] sizes){
            data = new int[totalrows][];
            for(int i = 0; i < totalrows; i++){
                data[i] = new int[sizes[i]];
            }
       }
       
       public void fillMatriksA(int size){
           int value = 5;
           for(int i = 0; i < size; i++){
               data[0][i] = value;
               value += 5;
           }
       }
       
       public void fillMatriksB(int size){
           int value = 3;
           for(int i = 0; i < size; i++){
               data[1][i] = value;
               value += 2;
           }
       }
       
       public void fillMatriksC(int size){
           int value = 2;
           for(int i = 0; i < size; i++){
                data[2][i] = value*value;
                value++;
           }
       }
       
       public void fillMatriksD(int size){
           int value = 4;
           for(int i = 0; i < size; i++){
               data[3][i] = value;
               value++;
           }
       }
       
       public void printMatriks(){
           for(int i = 0; i < data.length; i++) {
               for(int j = 0; j < data[i].length; j++) {
                   System.out.print(data[i][j] + " ");
               }
               System.out.println();
           }
       }
       
       public void searchNum(int target){
           boolean found = false;
           int count = 0;
           for(int i = 0; i < data.length; i++) {
               for(int j = 0; j < data[i].length; j++) {
                   if(data[i][j] == target) {
                       System.out.println("Angka: " + target + " ditemukan dibaris: " + i + " dikolom: " + j);
                       found = true;
                       count++;
                   }
               }
           }
           if(found){
               System.out.println("Angka: " + target + " ditemukan sebanyak: " + count);
           }else{
               System.out.println("Angka tidak ditemukan dalam baris dan kolom matriks");
           }
       }
       
       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           
           System.out.print("Masukan jumlah elemen matriks: ");
           int a = scanner.nextInt();
           System.out.print("Masukan jumlah elemen matriks: ");
           int b = scanner.nextInt();
           System.out.print("Masukan jumlah elemen matriks: ");
           int c = scanner.nextInt();
           System.out.print("Masukan jumlah elemen matriks: ");
           int d = scanner.nextInt();
           
           int[] size = {a, b, c, d};
           Matrix2D matriks = new Matrix2D(4, size);
           
           System.out.println("Matriks A dibuat");
           matriks.fillMatriksA(a);
           System.out.println("Matriks B dibuat");
           matriks.fillMatriksB(b);
           System.out.println("Matriks C dibuat");
           matriks.fillMatriksC(c);
           System.out.println("Matriks D dibuat");
           matriks.fillMatriksD(d);
           
           System.out.println("Matriks terbentuk: ");
           matriks.printMatriks();
           
           System.out.print("Masukan angka yang ingin dicari: ");
           int target = scanner.nextInt();
           while(target != 0){
               matriks.searchNum(target);
               target = scanner.nextInt();  
           }   
       }    

}