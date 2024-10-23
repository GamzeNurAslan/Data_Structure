package lab2_1;
public class Lab2_1 {
    int islem1(int [] k1){
        //Bir dizinin her bir elemanının küpünü alıp topluyor
        int toplam = 0;                                             //1
        for(int i=0;i<k1.length;i++){                               //(1,n+1,n)=>(2n+2)
           toplam += k1[i]*k1[i]*k1[i];                             //n
        }
       return toplam;                                               //1
    }                                                               //Toplam maliyet => 3n+4
    
    int islem2(int [] k2){
        int toplam = 0;                                             //1
        for(int i=0;i<k2.length;i++){                               //(1,n+1,n)=>(2n+2)
            for(int j=0;j<i;j++){                                   //((2n+2)*n)=>(2n^2+2n)
               toplam += k2[i]*k2[j];                               //n*n=>n^2
            }
        }
        return toplam;                                              //1
    }                                                               //Toplam maliyet => 3n^2+4n+4
    
    int toplama(int [] k){
        return islem1(k)+islem2(k);                                 //(3n+4) + (3n^2+4n+4) => 3n^2+7n+8
    }                                                               //O(n^2) olur,big-oh notasyonu                                                                      
    public static void main(String[] args) {
        int dizi [] = {11,12,10,27};
        Lab2_1 obj = new Lab2_1();                                  //static olarak tanımlayamadığımız için nesne tanımlamak zorunda kaldık
        System.out.println(obj.toplama(dizi));
    }
}
