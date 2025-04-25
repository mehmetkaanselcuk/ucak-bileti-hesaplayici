import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mesafe, yas, toplam;
        int tip;

        System.out.print("Mesafeyi kilometre cinsinden giriniz: ");
        mesafe = sc.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        yas = sc.nextDouble();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = sc.nextInt();

        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double normalTutar = mesafe * 0.10;


            if (yas < 12) {
                normalTutar = normalTutar * 0.5;
            } else if (yas >= 12 && yas < 24) {
                normalTutar = normalTutar * 0.9;
            } else if (yas >= 65) {
                normalTutar = normalTutar * 0.7;
            }

            switch (tip) {
                case 1:
                    toplam = normalTutar;
                    System.out.println("Toplam Tutar = " + toplam + " TL");
                    break;

                case 2:
                    normalTutar = normalTutar * 0.8;
                    toplam = normalTutar * 2;
                    System.out.println("Toplam Tutar = " + toplam + " TL");
                    break;
            }
        }
    }
}
