/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak1;

import java.util.Scanner;

/**
 *
 * @author HP series
 */
public class TugasPrak1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop;
        double suhu_awal;
        System.out.println("+=======================+");
        System.out.println("| PROGRAM KONVERSI SUHU |");
        System.out.println("+=======================+");
        System.out.println("");
        System.out.println("Input Data");
        System.out.println("------------------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhu_awal = input.nextDouble();
        
        do{
          Konversi Celcius = new Konversi(suhu_awal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----------------------");
            System.out.println("1. Lihat data konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.println("----------------------");
            System.out.print("Pilih\t: ");
            
            loop=input.nextInt();
            if(loop == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + suhu_awal + "°C");
                System.out.println("Suhu dalam Fahrenheit\t: " + Celcius.keFahrenheit() + "°F");
                System.out.println("Suhu dalam Reamur\t: " + Celcius.keReamur() + "°R");
                System.out.println("Suhu dalam Kelvin\t: " + Celcius.keKelvin() + "K");
                System.out.println("Kondisi Air adalah " + Celcius.kondisiair());
            }
            else if(loop == 2){
                System.out.println("------------------------");
                System.out.println("\n\tInput Data");
                System.out.println("------------------------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhu_awal = input.nextDouble();
            }
            else if(loop != 3){
                System.out.println("\nOpsi yang dipilih tidak tersedia. Pilih 1-3!");
            }
        }while(loop!=3);
    }
    }
