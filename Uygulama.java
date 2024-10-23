package uygulama;
public class Uygulama {
    //Verilen bir tamsayı listesi içinde/dizisinde *elemanları komşu olmak şartıyla* hangi(bitişik) alt dizi en yüksek toplamı verir?
    public static int BruteForce(int [] a){
        int maxTop = 0,bas = 0,son = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j<a.length-1;j++){  
                  int top = 0;
                    for(int k=i;k<=j;k++){                                      //Bu kodun big-oh notasyonu => O(N^3)'tür.
                       top += a[k];
                    }
                    if(top>maxTop){
                          maxTop = top;
                          bas = i;
                          son = j;
                      }
            }
        }
        for(int i=bas;i<=son;i++){
            System.out.println(a[i]+"+");
        }
        System.out.println("");
        return maxTop;
    }
    //*********************************************//
    public static int BruteForceImproved(int [] a){
    int maxTop = 0,bas=0,son=0;
    for(int i=0;i<a.length-1;i++){
          int top = 0;                                                          //Bu kodun big-oh notasyonu => O(N^2)'dir.
          for(int j=i;j<=a.length-1;j++){
              top += a[j];
              if(top>maxTop){
                    maxTop = top;
                    bas=i;
                    son=j;
              }
          }
    }
    for(int i=bas;i<=son;i++){
            System.out.println(a[i]+"+");
        }
        System.out.println("");
        return maxTop;
    }
    //********************************************//
    public static int Dogrusal(int [] a){
         int maxTop = 0,bas=0,son=0;
         int top = 0;                                                           //Bu kodun big-oh notasyonu => O(N)'dir.
         for(int i=0,j=0;j<=a.length-1;j++){
             top += a[j];
             if(top>maxTop){
                    maxTop = top;
                    bas=i;
                    son=j;
              }else if(top<0){
                  i=j+1;
                  top=0;
              }
         }
         for(int i=bas;i<=son;i++){
            System.out.println(a[i]+"+");
        }
        System.out.println("");
        return maxTop;
    }
    //*******************************************//
    public static void main(String[] args) {
         int [] x = {-2,11,-4,13,-5,2};
         System.out.println(BruteForce(x));
         System.out.println(BruteForceImproved(x));
         System.out.println(Dogrusal(x));
    }
}
