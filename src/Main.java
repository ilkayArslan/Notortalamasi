import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunu Giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = input.nextInt();

        int toplam = mat+kimya+fizik+muzik+tarih+turkce;
        double ortalama = toplam / 6;
        System.out.println(ortalama>=60?" Not Ortalamanız : " +ortalama+" Tebrikler Sınıfı Geçtiniz":"Not ortalamanız : "+ortalama+" Ne Yazıkki Kaldınız Seneye Daha çok çalışmalısınız");
    }
}