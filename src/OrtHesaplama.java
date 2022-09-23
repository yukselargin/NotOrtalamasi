import java.util.Scanner;

public class OrtHesaplama {
    public static void main (String[] args){
        int mat,kim,fzk,turkce,tarih,mzk;
        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin: ");
        mat = giris.nextInt();
        System.out.print("Kimya Notunuzu Girin: ");
        kim = giris.nextInt();
        System.out.print("Fizik Notunuzu Girin: ");
        fzk = giris.nextInt();
        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = giris.nextInt();
        System.out.print("Tarih Notunuzu Girin: ");
        tarih = giris.nextInt();
        System.out.print("Müzik Notunuzu Girin: ");
        mzk= giris.nextInt();


        int toplam = mat+kim+fzk+turkce+tarih+mzk;
        double sonuc = toplam/6.0;
        System.out.println("Not ortalaması: "+sonuc);
        int gecerNot= 60;
        boolean gecti = sonuc>=gecerNot;
        String deger = gecti ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(deger);
    }
}
