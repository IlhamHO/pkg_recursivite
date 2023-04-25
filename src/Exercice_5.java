public class Exercice_5 {
    public static int exposant(int a , int n){
        if(n == 0) return 1;
        else if(n%2 == 0) return exposant(a*a,n/2);
        else return a * exposant(a, n-1);
    }

    public static void main(String[] args) {
        System.out.println(exposant(2,3));
    }

}
