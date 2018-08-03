/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;
import java.util.Scanner;
/**
 *
 * @author GL553VD
 */
public class SaranBahan2Resep {
    public static void main(String[] args){
        String identitas = "Christo Yosia Nazareth / XRPL5 / 09";
        System.out.println("Identitas :"+ identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan pertama:");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.println("Masukkan no pilihan anda:");
        int bahan1 = scanner.nextInt();
        
        
    }
}
