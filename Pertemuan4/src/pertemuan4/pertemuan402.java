/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Sri Andayani
 * tanggal 12 April 2025
 * part 2
 */
public class pertemuan402 {
//    public static String[][] meja =  new String[3][3];
    
    public static void main(String[] args) {
        String[][] meja = new String[3][3];
        
        Scanner inp = new Scanner(System.in);
        
        for(int brs=0; brs<3; brs++){
            for(int klm=0; klm<3; klm++){
                System.out.printf("Data Meja Baris: %d, Kolom %d: ", brs, klm);
                meja[brs][klm] = inp.nextLine();
                
            }
        }
    }
    
    
}
