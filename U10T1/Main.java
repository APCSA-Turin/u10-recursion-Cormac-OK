public class Main{
    public static void main(String[] args){
        System.out.println(sum(10));
    }

    public static int factorial(int num){
        int total = 1;
        for(int i= 1; i <= num; i ++){
            total *= i;
        }
        return total;
    }

    public static int sum(int num){
        if(num > 1){
            return num + sum(num -1);
        }
        else{
            return 1;
        }
    }
}