

public class _Grup_2_FCFS_Algoritmasi {

    _Grup_2_Dosya_islemleri dosya = new _Grup_2_Dosya_islemleri();
    _Grup_2_Yazdirma yazdirma = new _Grup_2_Yazdirma();
    
    private static String[][] algoritmaDizi = new String[50][50];
    private static String[][] geciciDizi1 = new String[50][50];
    public static int dizi[][] = new int[50][50];
    private static int geciciDizi2[][] = new int[50][50];
    public static int burst_time [] = new int[50];
    public static int queue_time [] = new int[50];
    public static String Pid [] = new String[50];
    public void algoritma() throws InterruptedException {

        for (int i = 0; i < dosya.SatirSayisi; i++) {
            for (int j = 0; j < 3; j++) {

                algoritmaDizi[i][j] = dosya.geciciDizi2[i][j];

            }
        }

        for (int i = 0; i < dosya.SatirSayisi; i++) {
            for (int j = 1; j < 3; j++) {

                dizi[i][j] = Integer.parseInt(algoritmaDizi[i][j]);
             
            }
            ;
        }

        karsilastir(dizi);
        
          System.out.println("--------------------------------------");
           for (int j = 0; j < dosya.SatirSayisi; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("dizi " + j + i + "= " + algoritmaDizi[j][i] + " ");
            }
            System.out.println(" ");
        }
           ayristirma(algoritmaDizi);
           yazdirma.FCFS_Yazdir(Pid, burst_time, queue_time);
           
    }

    private void karsilastir(int[][] arr) {

        for (int i = 1; i <= dosya.SatirSayisi - 1; i++) {
            for (int j = 1; j < 3; j++) {
             
                geciciDizi2[i - 1][j] = arr[i - 1][j];
                geciciDizi2[i][j] = arr[i][j];
                 }
           }
        
         {
            for (int i = 1; i < dosya.SatirSayisi; i++) {
                
                
                        
                if (geciciDizi2[i][1] < geciciDizi2[i - 1][1]) {
                    
                     int geciciDeg1 = geciciDizi2[i - 1][1];
                     int geciciDeg2 = geciciDizi2[i - 1][2];
                     String geciciDEG0 = algoritmaDizi[i - 1][0];
                 
                    String geciciDEG1 = algoritmaDizi[i][0];
                 
                    algoritmaDizi[i - 1][0] = geciciDEG1;
                    algoritmaDizi[i - 1][1] = Integer.toString(geciciDizi2[i][1]);
                     algoritmaDizi[i - 1][2] = Integer.toString(geciciDizi2[i][2]);
                
                    algoritmaDizi[i][0] = geciciDEG0;
                      algoritmaDizi[i][1] = Integer.toString(geciciDizi2[i - 1][1]);
                    algoritmaDizi[i][2] = Integer.toString(geciciDizi2[i - 1][2]);
                        
                    geciciDizi2[i][1]=Integer.parseInt(algoritmaDizi[i][1]);
                    geciciDizi2[i-1][1]=Integer.parseInt(algoritmaDizi[i-1][1]);
                    geciciDizi2[i][2]=Integer.parseInt(algoritmaDizi[i][2]);
                    geciciDizi2[i-1][2]=Integer.parseInt(algoritmaDizi[i-1][2]);
                     
               
                    i=i-2;
                }
                
            }
        }

       
    }
    
    
    private void ayristirma (String[][] ayristirma) {
         for(int j =0; j<dosya.SatirSayisi;j++){
        
             
               
               
              Pid[j]=algoritmaDizi[j][0];
              queue_time[j]=Integer.parseInt(algoritmaDizi[j][1]);
              burst_time[j]=Integer.parseInt(algoritmaDizi[j][2]);
            
    } 
}
}