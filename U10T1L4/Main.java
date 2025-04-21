package U10T1L4;

public class Main{
    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibRecursive(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = fibIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibIter+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + iterativeTime + " | Time: " + iterativeTime / 1e6 + " ms");

    }

    private static int fibRecursive(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibRecursive(x - 1) + fibRecursive(x - 2);
    }

    public static int fibIterative(int n){
        int n1 = 0;
        int n2 = 1;
        for(int i = 0; i < n - 1; i ++){
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
        return n1;
    }
    
}
