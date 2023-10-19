import java.util.Scanner;

public class sumCal {
    public static void main(String[] args) {

        //Değişkenler
        Scanner input;
        int toplam = 0, sayi;

        //Hesaplama Bloğu
        do {
            //Kullanıcıdan Veri Gişiri
            System.out.print("Lütfen Sayı Giriniz : ");
            input = new Scanner(System.in);
            sayi = input.nextInt();
            if (sayi % 2 == 0) {
                if (sayi % 4 == 0) {
                    toplam = toplam + sayi;
                }
            }

        } while (sayi % 2 == 0);

        System.out.println("Toplam : " + toplam);

    }
}
