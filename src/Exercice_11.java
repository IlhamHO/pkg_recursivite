public class Exercice_11 {
    public static boolean estPair(int n){
        if(n >= 0 && n <= 9 && n%2 == 0) return true;
        else if(n >= 0 && n <= 9) return false;
        else return estPair(n%10) && estPair(n/10);
    }

    public static void main(String[] args) {
        System.out.println(estPair(4286));

    }
}
