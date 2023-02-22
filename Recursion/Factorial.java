import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0)return 1;
        int faith=factorial(n-1);
        return n*faith;
    }

    // Instide of write the above factorial function we can write factorialSort function in short =>
    public static int factorialSort(int n){
        return n==0 ? 1 : n*factorialSort(n-1);
    }
    
}
