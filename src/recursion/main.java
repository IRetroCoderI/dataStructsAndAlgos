package recursion;

public class main {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int factorial(int n){ //creates factorials using recursion
        if(n>=1){
            return n * factorial(n-1);
        } else {
            return 1;
        }

    }
    static int fib(int n){ //fibonacci sequence
        if (n>=3){
            return fib(n-1) + fib(n-2);
        } else { return 1; }
    }
}
