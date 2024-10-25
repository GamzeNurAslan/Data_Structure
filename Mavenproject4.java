
package com.mycompany.mavenproject4;

public class Mavenproject4 {
int ikiliArama2(int A[],int N,int sayi){
        int sol = 0;
        int sag = N-1;
        
        while(sol<=sag){
        int orta = (sol+sag)/2;
        if(A[orta]==sayi)   return orta;
        else if(sayi<A[orta])   sag=orta-1;
        else  sol=orta+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Mavenproject4 arama = new Mavenproject4();
        int A[] = {1, 2, 3, 4, 5};
        System.out.println(arama.ikiliArama2(A, A.length, 3));
    }
}
