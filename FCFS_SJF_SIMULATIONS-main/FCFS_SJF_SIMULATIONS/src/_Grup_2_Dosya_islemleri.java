
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Furkan
 */
public class _Grup_2_Dosya_islemleri {
    
    public int degisken_sayisi;
    public static String[] dizi = new String[50];
    public static String[][] geciciDizi2 = new String[50][50];
    public String[][] gecici = new String[50][50];
    public static int SatirSayisi = 0;
    public void Dosya_Oku() throws IOException {
    File file = new File("prosesler.txt");
   
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
      

     while (reader.readLine() != null){ 
        
         SatirSayisi++;
          
           
            
     }
      reader.close();
      reader = new BufferedReader(new FileReader(file));
        
       for(int j=0; j<SatirSayisi ; j++){
       String i=reader.readLine();
          
           dizi[j]=i;
           
           
       }
 
       
     
    }
public void cizgiAyir() {

        for (int i = 0; i < SatirSayisi; i++) {
            int j = 0;

            String str = dizi[i];
            
            String[] arrOfStr = str.split("[ ]+", -2);

             for (String a : arrOfStr) {
               
                geciciDizi2[i][j] = a;

                j++;
                 
            }
            
        }

    }
   

}
    

