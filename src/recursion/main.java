package recursion;

public class main {
    public static void main(String[] args) {
//        walk(5);
//        walkrec(5);
        System.out.println(fact(10));

    }
    public static void walk(int steps){
        for(int i = 1; i<=steps; i++){
            System.out.println(i + " step");
        }
    }
    public static void walkrec(int steps){
        if(steps > 1){
            System.out.print(" step\n");
            walkrec(steps-1);
        } else {
            System.out.print("step!");
        }

    }
    public static int fact(int n){
        if(n<1){ //
            return 1;
        } else {
            return n * fact(n-1);
        }

    }
}
