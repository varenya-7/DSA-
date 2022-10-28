package Recursion;

public class GCDandLCM{
    public static void main(String[] args) {

        System.out.println("Highest Common factor is:- "+GCD(4, 12));
        System.out.println("Least Common Multiple is:- "+LCM(4, 12));
    }
    static int GCD(int a , int b){
        if(a == 0){
            return b;
        }
        return GCD(b % a , a);
    }
    static int LCM( int a , int b){
        return (a * b) / GCD(a , b);
    }

}
