/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Najwa
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Bangundatar output = new Bangundatar();
        Scanner input = new Scanner(System.in);
        int pilihan;
        char ulang;
        do{
        System.out.println("\n\t=================MENU=================\n");
        System.out.println("\t1. Square");
        System.out.println("\t2. Rectangle");
        System.out.println("\t3. Circle");
        System.out.println("\t4. Elips");
        System.out.print("\tMasukkan pilihan Anda: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.print("\t Masukkan sisi persegi: ");
                output.lengthofside = input.nextInt();
                System.out.println("\t 1. Luas Persegi");
                System.out.println("\t 2. Keliling Persegi ");
                System.out.print("\tPilih menu: ");
                int a = input.nextInt();
                if(a == 1){
                output.SquareArea();
                System.out.println("\tLuas Persegi adalah  "+output.SquareArea());
                }
                else if(a == 2){
                    output.SquareParimeter();
                    System.out.println("\t Keliling Persegi adalah "+output.SquareParimeter());
                }  else{
                    System.out.println("\tPILIHAN TIDAK ADA");
                }
                break;
            case 2:
                System.out.print("\t Masukkan lebar: ");
                output.width = input.nextInt();
                System.out.print("\t Masukkan tinggi: ");
                output.height=input.nextInt();
                System.out.println("\t 1. Luas Persegi Panjang");
                System.out.println("\t 2. Keliling Persegi Panjang ");
                System.out.print("\tPilih menu: ");
                int b = input.nextInt();
                if(b == 1){
                output.RectangleArea();
                System.out.println("\tLuas Persegi Panjang adalah  "+output.RectangleArea());
                }
                else if(b == 2){
                    output.RectangleParimeter();
                    System.out.println("\t Keliling Persegi Panjang adalah "+output.RectangleParimeter());
                }else{
                    System.out.println("\tPILIHAN TIDAK ADA");
                }
                break;
            case 3:
                System.out.print("\t Masukkan radius: ");
                output.radius=input.nextInt();
                System.out.println("\t 1. Luas Lingkaran");
                System.out.println("\t 2. Keliling Lingkaran ");
                System.out.print("\tPilih menu: ");
                int c = input.nextInt();    
                 if(c == 1){
                output.CircleArea();
                System.out.println("\tLuas Lingkaran adalah "+output.CircleArea());
                }
                else if(c == 2){
                    output.CircleParimeter();
                    System.out.println("\t Keliling Lingkaran adalah "+output.CircleParimeter());
                }else{
                    System.out.println("\tPILIHAN TIDAK ADA");
                }
                 break;
            case 4:
                System.out.print("\t Masukkan Semi Major Axis: ");
                output.semimajoraxis = input.nextInt();
                System.out.print("\t Masukkan Semi Minor Axis: ");
                output.semiminoraxis=input.nextInt();
                System.out.println("\t 1. Luas Elips");
                System.out.println("\t 2. Keliling Elips ");
                System.out.print("\tPilih menu: ");
                int d = input.nextInt();
                if(d == 1){
                output.ElipsArea();
                System.out.println("\tLuas Elips adalah "+output.ElipsArea());
                }
                else if(d == 2){
                    output.ElipsParimeter();
                    System.out.println("\t Keliling Elips adalah "+output.ElipsParimeter());
                } else{
                    System.out.println("\tPILIHAN TIDAK ADA");
                }
                break;
        }
                System.out.print("\tIngin menghitung kembali? (y/t): ");
                ulang = input.next().charAt(0);
        }
        while (ulang!='t');
        System.out.println("TERIMAKASIH");
    }
    
}
