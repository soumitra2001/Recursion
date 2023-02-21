// Print n to 1 number each line =>
class Basic{
    public static void main(String[] args) {
        // printDecreasing(1000);
        // printIncreasing(100);
        func(5);
    }

    public static void printDecreasing(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void func(int n) { 
        if(n <= 0) {
            System.out.println("Base: " + n);
            return;
        }
        System.out.println("Pre: " + n);
        func(n - 1);
        System.out.println("In: " + n);
        func(n - 2);
        System.out.println("Post: " + n);
    }
}