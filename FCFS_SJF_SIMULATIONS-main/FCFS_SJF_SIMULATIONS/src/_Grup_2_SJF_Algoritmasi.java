
public class _Grup_2_SJF_Algoritmasi {
    
    _Grup_2_Dosya_islemleri dosya = new _Grup_2_Dosya_islemleri();
    _Grup_2_Yazdirma yazdirma = new _Grup_2_Yazdirma();
    
    private static String[][] algoritmaDizi1 = new String[50][50];
    private static String[][] geciciDizi1 = new String[50][50];
    public static int dizi[][] = new int[50][50];
    private static int geciciDizi[][] = new int[50][50];
    public static int burst_time1[] = new int[50];
    public static int queue_time1[] = new int[50];
    public static String Pid1[] = new String[50];
    
    private int counter = 0;
    
    public void algoritma() throws InterruptedException {
        
        for (int i = 0; i < dosya.SatirSayisi; i++) {
            for (int j = 0; j < 3; j++) {
                
                algoritmaDizi1[i][j] = dosya.geciciDizi2[i][j];
                
            }
        }
        for (int i = 0; i < dosya.SatirSayisi; i++) {
            for (int j = 1; j < 3; j++) {
                
                dizi[i][j] = Integer.parseInt(algoritmaDizi1[i][j]);
                
            }
            ;
        }

       karsilastir(dizi);
        
          System.out.println("--------------------------------------");
           for (int j = 0; j < dosya.SatirSayisi; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("dizi " + j + i + "= " + algoritmaDizi1[j][i] + " ");
            }
            System.out.println(" ");
        }
        ayristirma(algoritmaDizi1);
        //yazdirma.FCFS_Yazdir(Pid1, burst_time1, queue_time1);
        
    }
    
    private void karsilastir(int[][] arr) throws InterruptedException {
        
        for (int i = 1; i <= dosya.SatirSayisi - 1; i++) {
            for (int j = 1; j < 3; j++) {
                
                geciciDizi[i - 1][j] = arr[i - 1][j];
                geciciDizi[i][j] = arr[i][j];
                 }
           }
        
        {
            for (int i = 1; i < dosya.SatirSayisi; i++) {
                
                int j = i - 1;
                
                   
                if (geciciDizi[i][2] < geciciDizi[j][2]) {
                    
                     int geciciDeg1 = geciciDizi[j][1];
                     int geciciDeg2 = geciciDizi[j][2];
                     
                    String geciciDEG0 = algoritmaDizi1[j][0];
                    
                    String geciciDEG1 = algoritmaDizi1[i][0];
                    
                    algoritmaDizi1[j][0] = geciciDEG1;
                    algoritmaDizi1[j][1] = Integer.toString(geciciDizi[i][1]);
                    algoritmaDizi1[j][2] = Integer.toString(geciciDizi[i][2]);
                     
                    algoritmaDizi1[i][0] = geciciDEG0;
                     algoritmaDizi1[i][1] = Integer.toString(geciciDizi[j][1]);
                    algoritmaDizi1[i][2] = Integer.toString(geciciDizi[j][2]);
                        
                    geciciDizi[i][1] = Integer.parseInt(algoritmaDizi1[i][1]);
                    geciciDizi[j][1] = Integer.parseInt(algoritmaDizi1[j][1]);
                    geciciDizi[i][2] = Integer.parseInt(algoritmaDizi1[i][2]);
                    geciciDizi[j][2] = Integer.parseInt(algoritmaDizi1[j][2]);
                      
                    i = i - 2;
                    
                    if (i == -1) {
                        i++;
                    }
                }
                
            }
            
        }
        
      
        
    }
    
    private void ayristirma(String[][] ayristirma) {
        for (int j = 0; j < dosya.SatirSayisi; j++) {
            
            Pid1[j] = algoritmaDizi1[j][0];
            queue_time1[j] = Integer.parseInt(algoritmaDizi1[j][1]);
            burst_time1[j] = Integer.parseInt(algoritmaDizi1[j][2]);
               
        }
    }
    
}
