package lab2_2;
public class Lab2_2 {
    int worker(int n){
    int product = 1;
      while(product<n){
           product = product*2;
    }
      return product;
    }
    public static void main(String[] args) {
       Lab2_2 obj = new Lab2_2();
        System.out.println(obj.worker(20));
    }
    
}
