package Recursion;
import java.util.Scanner;
public class SeiveOfEratosthenes {

     static void sieve(int range , boolean[]arr){

         for(int i = 2; i*i <=range; i++){
             if(!arr[i]){
                 for (int j = 2 * i; j <=range ; j+=i) {
                     arr[j]=true;
                 }
             }
         }

         for (int i = 2; i <=range ; i++) {
             if(!arr[i])
             System.out.println(i+" ");
         }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range=sc.nextInt();
        boolean arr[]=new boolean[range + 1];
         sieve(range , arr);
    }
}

