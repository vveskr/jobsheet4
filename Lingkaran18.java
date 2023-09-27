import java.util.Scanner;

public class Lingkaran18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Deklarasi
        int r;
        double phi=3.14;
        double keliling, luas;
        //Proses
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;
        //output
        System.out.println(keliling);
        System.out.println(luas);
    }
}