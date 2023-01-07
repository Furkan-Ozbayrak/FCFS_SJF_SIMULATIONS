
import java.util.LinkedList;
import java.util.*;
import java.io.*;

public class _Grup_2_Yazdirma {

    _Grup_2_Dosya_islemleri dosya = new _Grup_2_Dosya_islemleri();
    
    
    public int[][] SJFDIZI = new int[50][50];
    
    public void FCFS_Yazdir(String[] ProsesID, int[] Burst_Time, int[] Queue_Time) throws InterruptedException {

        System.out.println("yazdirma");
        System.out.println("-----------------------------------");
        LinkedList<String> KuyrukList = new LinkedList<String>();
        int Kuyruk_sayaci = 0;
        int Calisma_Zamani = 0;
        int Calisma_zamani2 = Queue_Time[0];
        int Sayac = 0;
        int j = 0;

       for (int i = 0; i < Burst_Time.length; i++) {
            KuyrukList.add(ProsesID[i]);
            Kuyruk_sayaci++;
        }

        while (!KuyrukList.isEmpty()) {
            if (Calisma_zamani2 == Queue_Time[Sayac]) {
                Calisma_zamani2 = Calisma_zamani2 + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;

            } else if (Calisma_zamani2 < Queue_Time[Sayac]) {
                Calisma_zamani2 = Queue_Time[Sayac] + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;
            } else if (Calisma_zamani2 > Queue_Time[Sayac]) {
                Calisma_zamani2 = Calisma_zamani2 + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;
            }

        }

   
        for (j = 0; j < Calisma_zamani2; j++) {
            Calisma_Zamani = Calisma_Zamani + 1;
            if (KuyrukList.isEmpty()) {
                Thread.sleep(1000);

            }
          
            for (int i = 0; i < dosya.SatirSayisi; i++) {
                if (Calisma_Zamani == Queue_Time[i]) {
                   KuyrukList.add(ProsesID[i]);
                    System.out.println(KuyrukList.get(i) + " Prosesi " + Calisma_Zamani + " saniyesinde kuyruğa girdi");

                    for (int k = 1; k < Burst_Time[i] + 1; k++) {

                        if (Calisma_Zamani + 1 == Queue_Time[i]) {
                            KuyrukList.add(ProsesID[i]);
                            System.out.println(KuyrukList.get(i) + " Prosesi " + Calisma_Zamani + " saniyesinde kuyruğa girdi");
                            break;

                        }

                    }int toplamsayac=0;
                    System.out.println(KuyrukList.get(i) + " Prosesi " + Calisma_Zamani + " saniyesinde çalışmaya başladı");
                    for (int k = 1; k < Burst_Time[i] + 1; k++) {
                        
                        System.out.println(KuyrukList.get(i) + " Prosesi " + k + " saniye çalıştı");
                        
                        Thread.sleep(1000);
                        toplamsayac++;

                    }
                    System.out.println(KuyrukList.get(i) + " Prosesi toplam " + toplamsayac + " saniye çalıştı");
                    Thread.sleep(1000);
                    j++;
                }
            }
        }
        float ortalama = Calisma_zamani2 / dosya.SatirSayisi;
        System.out.println("Ortalama bekleme süresi= " +ortalama);

    }
public void SJF_Yazdir(String[] ProsesID, int[] Burst_Time, int[] Queue_Time) throws InterruptedException {

        System.out.println("SJFyazdirma");
        System.out.println("-----------------------------------");
        LinkedList<String> KuyrukList = new LinkedList<String>();
        int Kuyruk_sayaci = 0;
        int Calisma_Zamani = 0;
        int Calisma_zamani2 = Queue_Time[0];
        int Sayac = 0;
        int j = 0;

        for (int i = 0; i < Burst_Time.length; i++) {
            KuyrukList.add(ProsesID[i]);
            Kuyruk_sayaci++;
        }

        while (!KuyrukList.isEmpty()) {
            if (Calisma_zamani2 == Queue_Time[Sayac]) {
                Calisma_zamani2 = Calisma_zamani2 + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;

            } else if (Calisma_zamani2 < Queue_Time[Sayac]) {
                Calisma_zamani2 = Queue_Time[Sayac] + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;
            } else if (Calisma_zamani2 > Queue_Time[Sayac]) {
                Calisma_zamani2 = Calisma_zamani2 + Burst_Time[Sayac];
                Sayac++;
                KuyrukList.remove();
                continue;
            }

        }

        System.out.println("Queue_Time time= " + Queue_Time[0] + " i=0");
        System.out.println("Queue_Time time= " + Queue_Time[1] + " i=1");
        System.out.println("Queue_Time time= " + Queue_Time[2] + " i=2");
        System.out.println("Queue_Time time= " + Queue_Time[3] + " i=3");

        for (j = 0; j < Calisma_zamani2; j++) {
            Calisma_Zamani = Calisma_Zamani + 1;
            if (KuyrukList.isEmpty()) {
                Thread.sleep(1000);

                }
           
            for (int i = 0; i < dosya.SatirSayisi; i++) {
                 if (Calisma_Zamani == Queue_Time[i]) {
                    KuyrukList.add(ProsesID[i]);
                    System.out.println(KuyrukList.get(i) + " Prosesi " + Calisma_Zamani + " saniyesinde kuyruğa girdi");

                    for (int k = 1; k < Burst_Time[i] + 1; k++) {

                         if (Calisma_Zamani + 1 == Queue_Time[i]) {
                            KuyrukList.add(ProsesID[i]);
                            System.out.println(KuyrukList.get(i) + " Prosesi " + Calisma_Zamani + " saniyesinde kuyruğa girdi");
                            break;

                        }

                    }
                    for (int k = 1; k < Burst_Time[i] + 1; k++) {
                        System.out.println(KuyrukList.get(i) + " Prosesi " + k + " saniye çalıştı");

                    }
                    j++;
                }
            }
            }
        float ortalama = Calisma_zamani2 / dosya.SatirSayisi;
        System.out.println("Ortalama bekleme süresi= " +ortalama);

    }}