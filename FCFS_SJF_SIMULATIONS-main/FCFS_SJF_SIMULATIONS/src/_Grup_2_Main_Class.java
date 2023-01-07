
import java.io.IOException;

public class _Grup_2_Main_Class {

    public static void main(String[] args) throws IOException, InterruptedException {

        _Grup_2_Dosya_islemleri islem = new _Grup_2_Dosya_islemleri();
        _Grup_2_FCFS_Algoritmasi FCFS = new _Grup_2_FCFS_Algoritmasi();
        _Grup_2_SJF_Algoritmasi SJF = new _Grup_2_SJF_Algoritmasi();

        islem.Dosya_Oku();
        islem.cizgiAyir();

        System.out.println(" SJF  ");
        SJF.algoritma();
        System.out.println("     ");
        System.out.println(" FCFS ");
        FCFS.algoritma();

    }

}
