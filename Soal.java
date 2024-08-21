
import java.util.Scanner;

public class Soal{
public static void main(String[] args) {
    System.out.println("Kalkulator Barang");
    String NamaBarang;
    double harga;
    double jumlah;
    double diskon;
    double total;
    double jadi_satu;
    Scanner masukan = new Scanner(System.in);
 System.out.println("Masukkan Nama Barang  = ");
 NamaBarang = masukan.next();

System.out.println("Harga =");
harga = masukan.nextDouble();

System.out.println("Jumlah Barang =");
jumlah = masukan.nextDouble();
jadi_satu = harga * jumlah;

System.out.println("masukkan diskon =");
diskon = masukan.nextDouble();


total = ( harga * jumlah );
diskon = diskon / 100 * jadi_satu;
total = total - diskon;
System.out.println("Total Harga adalah =" +total);







}


}