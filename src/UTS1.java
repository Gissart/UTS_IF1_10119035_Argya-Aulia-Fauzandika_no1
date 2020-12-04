import java.util.Calendar;
import java.util.Scanner;

/*
Nama    : Argya Aulia Fauzandika
Kelas   : IF1
NIM     : 10119035
Deskripsi : Program mengelompokkan umur
*/

public class UTS1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        Age ag = new Age(cal.get(Calendar.YEAR));

        System.out.print("Masukkan tahun lahir anda :");
        ag.setYearBirth(scan.nextInt());

        System.out.println("=====Hasil perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+ag.getYearBirth());
        System.out.println("Hari ini tahun : "+ag.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+ag.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu \033[31m"+ag.tandanyaKamu(ag.hitungUmur()));
    }
}
