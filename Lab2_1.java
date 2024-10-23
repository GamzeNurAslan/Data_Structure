
package lab2_1;
public class Lab2_1 {
    int islem1(int [] k1){
        //Bir dizinin her bir elemanının küpünü alıp topluyor
        int toplam = 0;
        for(int i=0;i<k1.length;i++){
           toplam += k1[i]*k1[i]*k1[i];
        }
       return toplam;
    }
    int islem2(int [] k2){
        int toplam = 0;
        for(int i=0;i<k2.length;i++){
            for(int j=0;j<i;j++){
               toplam += k2[i]*k2[j];
            }
        }
        return toplam;
    }
    int toplama(int [] k){
        return islem1(k)+islem2(k);
    }
    public static void main(String[] args) {
        int dizi [] = {11,12,10,27};
        Lab2_1 obj = new Lab2_1();
        System.out.println(obj.toplama(dizi));
    }
    
}
