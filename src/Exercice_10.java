public class Exercice_10 {
    public static int nbDeux(int n){
        if(n == 2) return 1;
        else if(n>=0 && n<=9) return 0;
        return nbDeux(n%10)+ nbDeux(n/10);
    }

    public static void main(String[] args) {
        System.out.println(nbDeux(125425421));
    }
}
