package Recursion;

public class SquareRootUsingBinarySearch {

    public static void main(String[] args) {
        int n=40;
        int p=3; // p stands for the number of decimal place the user needs the answer
        System.out.println(sqrt(n,p));
    }
    static double sqrt(int n ,int p){

        int s=0;
        int e=n;
double root =0.0;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return n;
            }
            if(mid * mid > n){
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        double increment= 0.1;
        for (int i = 0; i < p; i++) {

            while ((root * root) <= n) {
                root+=increment;
            }
            root=root-increment;
              increment /= 10;
        }

        return root;
    }
}
