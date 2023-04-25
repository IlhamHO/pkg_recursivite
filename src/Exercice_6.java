public class Exercice_6 {
    public static int nbChiffres(int n){
        if(n>=0 && n<=9) return 1;
        else return 1+nbChiffres(n/10);
    }

    public static void main(String[] args) {
        System.out.println(nbChiffres(1000));
    }
}
