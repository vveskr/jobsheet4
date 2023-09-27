import java.util.Scanner;

public class HargaBayar18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Deklarasi
        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        //Proses
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah = input.nextInt();
        System.out.println("Merk Buku:");
        merkBuku = input.next();
        System.out.println("Jumlah Halaman Buku: ");
        jmlHalBuku = input.nextInt();
        System.out.println("Diskon: ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
