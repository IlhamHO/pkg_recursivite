public class Exercice_7 {
    public static int sum(int n){
        if(n>=0 && n<=9) return n;
        else return n%10 + sum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1435));
    }
}
