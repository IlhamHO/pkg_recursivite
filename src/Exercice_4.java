public class Exercice_4 {
    public static int exp(int a, int n){
        if(n==0) return 1;
        else return a * exp(a,n-1);
    }

    public static void main(String[] args) {
        System.out.println(exp(2,4));
    }
}
