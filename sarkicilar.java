import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;

public class sarkicilar {
    private ArrayList<String> sarkiciListesi=new ArrayList<String>();

    public void sarkiciBastir(){
        System.out.println("Şarkıcı listesinde " + sarkiciListesi.size()+ " kadar şarkıcı var.");
        for (int i =0 ; i<sarkiciListesi.size();i++){
            System.out.println( (i+1) +" .Şarkıcı: "+sarkiciListesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println("Ekleme basarılı...");
    }
    public void sarkiciGuncelle(int pozisyon,String sarkiciAdi){
        sarkiciListesi.set(pozisyon,sarkiciAdi);

        System.out.println("Güncelleme basarılı...");
    }
    public void sarkiciSil(int pozisyon){
        String isim= sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);

        System.out.println("Silme basarılı...");
    }
    public void sarkiciAra(String sarkiciAdi){
        int pozisyon=sarkiciListesi.indexOf(sarkiciAdi);

        if(pozisyon != -1){
            System.out.println("Şarkıcı bulundu. "+sarkiciAdi +" "+ pozisyon+1+". pozisyonda...");
        }else{
            System.out.println("Sarkıcı bulunamadı...");
        }

    }

}
