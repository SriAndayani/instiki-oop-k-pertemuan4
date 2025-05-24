/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Sri Andayani
 * Tanggal 12 April 2025
 * Kelas Pertemuan 4
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dream = new String[7];
        
        dream[0] = "Mark Lee";
        dream[1] = "Jeno Lee";
        dream[2] = "Haechan Lee";
        dream[3] = "Huang Renjun";
        dream[4] = "Jaemin Na";
        dream[5] = "Zhong Chenle";
        dream[6] = "Jisung";
        
//        for(int i=0;i<dream.length;i++){
//            System.out.println("Member ke-"+i+": "+dream[i]);
//        }

        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<7; idx++) {
            System.out.print("Data Member ke-"+String.valueOf(idx+1)+": ");//bisa juga menggunakan Integer.toString
            dream[idx] = inp.nextLine();
        }
        
        String NctDream = dream[3];
        System.out.printf("Nct Dream : %s\n", dream[3]);
        
        //Menampilkan data Array dengan Perulangan
        
        for(int i=0;i<dream.length;i++){
            System.out.println("Member ke-"+i+": "+dream[i]);
        }
        
        //khusus menangani tentang array.(foreach)jadi dia bia menampilkan setiap index dari array
        for(String nm : dream){
            System.out.println(nm);
        }
        
    }
    
}
