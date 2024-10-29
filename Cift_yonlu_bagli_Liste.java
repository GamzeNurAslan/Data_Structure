package com.mycompany.cift_yonlu_bagli_liste;

class Link {
    public int veri;
    public Link sonraki;
    public Link onceki;

    public Link(int d) {
        veri = d;
    }

    public void Listele() {
        System.out.print(veri + " ");
    }
}

class IkiyonluListe {
    Link ilk;
    Link son;

    public IkiyonluListe() {
        ilk = null;
        son = null;
    }

    public boolean bosmu() {
        return ilk == null;
    }

    public void basaEkle(int yeni) {
        Link yenidugum = new Link(yeni);
        if (bosmu()) {
            son = yenidugum;
        } else {
            ilk.onceki = yenidugum;
            yenidugum.sonraki = ilk;
        }
        ilk = yenidugum;
    }

    public void sonaEkle(int yeni) {
        Link yenidugum = new Link(yeni);
        if (bosmu()) {
            ilk = yenidugum;
        } else {
            son.sonraki = yenidugum;
            yenidugum.onceki = son;
        }
        son = yenidugum;
    }

    public boolean arkasinaEkle(int anahtar, int yeni) {
        Link temp = ilk;
        while (temp != null && temp.veri != anahtar) {
            temp = temp.sonraki;
        }
        if (temp == null) {
            return false; 
        }

        Link yenidugum = new Link(yeni);
        if (temp == son) {
            yenidugum.sonraki = null;
            temp.sonraki = yenidugum;
            yenidugum.onceki = temp;
            son = yenidugum;
        } else {
            yenidugum.sonraki = temp.sonraki;
            yenidugum.onceki = temp;
            temp.sonraki.onceki = yenidugum;
            temp.sonraki = yenidugum;
        }
        return true;
    }

    public boolean Ara(int anahtar) {
        Link temp = ilk;
        while (temp != null) {
            if (temp.veri == anahtar) {
                return true; 
            }
            temp = temp.sonraki;
        }
        return false; 
    }

    public Link bastanSil() {
        if (bosmu()) return null;
        
        Link gecici = ilk;
        if (ilk.sonraki == null) {
            son = null;
        } else {
            ilk.sonraki.onceki = null;
            ilk = ilk.sonraki;
        }
        return gecici;
    }

    public Link sondanSil() {
        if (bosmu()) return null;

        Link gecici = son;
        if (son.onceki == null) {
            ilk = null;
        } else {
            son.onceki.sonraki = null;
            son = son.onceki;
        }
        return gecici;
    }

    public Link seciliSil(int anahtar) {
        Link temp = ilk;
        while (temp != null && temp.veri != anahtar) {
            temp = temp.sonraki;
        }
        if (temp == null) {
            return null; 
        }
        if (temp == ilk) {
            ilk = temp.sonraki;
        } else {
            temp.onceki.sonraki = temp.sonraki;
        }
        if (temp == son) {
            son = temp.onceki;
        } else {
            temp.sonraki.onceki = temp.onceki;
        }
        return temp;
    }

    public void enYuksek() {
        if (bosmu()) {
            System.out.println("Liste boş.");
            return;
        }
        
        Link temp = ilk;
        Link max = ilk; 
        while (temp != null) {
            if (temp.veri > max.veri) {
                max = temp;
            }
            temp = temp.sonraki;
        }
        System.out.println("En yüksek değer: " + max.veri);
    }

    public void yazdir() {
        System.out.print("Liste : ");
        Link temp = ilk;
        while (temp != null) {
            temp.Listele();
            temp = temp.sonraki;
        }
        System.out.println();
    }
}

public class Cift_yonlu_bagli_Liste {
    public static void main(String[] args) {
        IkiyonluListe liste = new IkiyonluListe(); 
        liste.basaEkle(7);
        liste.basaEkle(5);
        liste.sonaEkle(9);
        liste.sonaEkle(4);
        liste.arkasinaEkle(7, 6);
        liste.yazdir();
        liste.enYuksek();

        if(liste.bosmu()){
              System.out.println("liste boş");
        }else{
             System.out.println("liste boş değil");
        }
        liste.bastanSil();
        liste.yazdir();
        liste.sondanSil();
        liste.yazdir();
        liste.seciliSil(4);
        liste.yazdir();

        if(liste.ara(4)){
            System.out.println("bulundu");
        }else{
            System.out.println("bulunamadı");
        }
    }
}
