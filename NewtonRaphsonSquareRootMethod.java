package Maths;

/*Formula used

Actual Root = [X + ( N / X)] / 2;
here X is the guessed root and [Actual root - X] is the error

Steps to Find the answer from this method
1.) Assign N to X;
2.) You will find the answer is the error is < 1 ,0.5, 0.4 as much precesion you wants
3.) Otherwise we will update our root
*/
public class NewtonRaphsonSquareRootMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(int n){
        double root;
        double x=n;

        while(true){

            root= 0.5 * (x +(n / x));
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}
