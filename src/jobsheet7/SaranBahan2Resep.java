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
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua:");
            if(bahan1 == 1){
                System.out.println("1. susu");
                System.out.println("2. minyak goreng");
                System.out.println("3. tidak ada");
            }else{
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. tidak ada");
            }
            System.out.println("Masukkan no pilihan Anda:");
            int bahan2 = scanner.nextInt();
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan," + "tidak dapat memberikan saran resep");
        
        int bahan2 = scanner.nextInt();
        
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat milk shake banana"); break;
                    case 2: System.out.println("Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println("Anda dapat membuat pisang rebus"); break;    
                    }
            else
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println("Anda dapat membuat sandwich telur"); break;
                    case 3: System.out.println("Anda dapat membuat telur rebus"); break;  
                }
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan,"+"tidak dapat memberikan saran resep");
    }
}
