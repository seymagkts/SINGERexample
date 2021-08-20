import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
        private static sarkicilar sarkicilar=new sarkicilar();
        private static Scanner scanner = new Scanner(System.in);

        public static void goruntule(){
            sarkicilar.sarkiciBastir();
        }
        public static void ekle(){
            System.out.println("Eklenmek istenen sarkıcı: ");
            String isim=scanner.nextLine();
            sarkicilar.sarkiciEkle(isim);
        }
        public static void guncelle(){
            System.out.println("Güncellenecek pozisyon: ");
            int pozisyon=scanner.nextInt();
            scanner.nextLine();
            String yeniIsim=scanner.nextLine();
            sarkicilar.sarkiciGuncelle(pozisyon-1,yeniIsim);
        }
        public static void sil(){
            System.out.println("Silinecek pozisyonu seçin: ");
            int pozisyon=scanner.nextInt();
            sarkicilar.sarkiciSil(pozisyon-1);
        }
        public static void ara(){
            System.out.println("Aramak istenilen sarkıcı: ");
            String aranan=scanner.nextLine();
            sarkicilar.sarkiciAra(aranan);
        }

    public static void main(String[] args) {
        String islemler = "\t 0.İslemleri görüntüle\n"+
                "\t 1.Şarkıcıları görüntüle\n"+
                "\t 2.Şarkıcı ekle\n"+
                "\t 3.Şarkıcı güncelle\n"+
                "\t 4.Şarkıcı sil\n"+
                "\t 5.Şarkıcı ara\n"+
                "\t 6.Uygulamadan çık\n";

        System.out.println(islemler);

        boolean cikis = false;
        int islem;
        while(!cikis){
            System.out.println("Bir işlem seçiniz: ");
            islem=scanner.nextInt();
            scanner.nextLine();

            switch(islem){
                case 0:
                    System.out.println(islemler);
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    ekle();
                    break;
                case 3:
                    guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan cıkılıyor");
                    break;
            }
        }
    }
}

