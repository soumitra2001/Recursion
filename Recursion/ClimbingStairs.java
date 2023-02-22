import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Step: ");
        System.out.println(step(sc.nextInt()));
    }

    public static int step(int n) {
        if (n <= 1)
            return 1;
        int s1 = step(n - 1);
        int s2 = step(n - 2);
        return s1 + s2;
    }
}
