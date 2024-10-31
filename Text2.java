
package com.mycompany.text2;

class Eleman{
    int icerik;
    Eleman ileri;
    public Eleman(int icerik){
        this.icerik=icerik;
        this.ileri=null;
    }    
}
public class Text2 {
    Eleman ust;
    public Text2(){
        ust=null;        
    }
    boolean bosmu(){
        if(ust==null) return true;
        else return false;
    }
    void Ekle(Eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }
    Eleman sil(){
        Eleman e=ust;
        if(!bosmu())
            ust=ust.ileri;
        return e;       
    }
    int enBuyuk(){
        int buyuk;
        Eleman e;
        Text2 y1=new Text2();
        e=sil();
        y1.Ekle(e);
        buyuk=e.icerik;
        while(!bosmu()){
            e=sil();
            y1.Ekle(e);
            if(e.icerik>buyuk)
                buyuk=e.icerik;
        }
        while(!y1.bosmu()){
            e=y1.sil();
            Ekle(e);
        }
        return buyuk;
    }

    public static void main(String[] args) {
        Text2 y = new Text2();

        // Yığına elemanlar ekle
        y.Ekle(new Eleman(10));
        y.Ekle(new Eleman(20));
        y.Ekle(new Eleman(5));
        y.Ekle(new Eleman(15));
        y.Ekle(new Eleman(30));

        // En büyük elemanı bul
        int enBuyuk = y.enBuyuk();
        System.out.println("Yığındaki en büyük eleman: " + enBuyuk);
    }
}
