public class exercice_13 {
    public static int plusGrandChiffre(int n){
        if(n<10) return n;
        else{
            int max = n%10;
            plusGrandChiffre(n/10);
            int suivant = n%10;
            if(max<suivant) max=suivant;
            return max;
        }
        //1486 max=6 => 148 suivant=8
    }

    public static void main(String[] args) {
        System.out.println(plusGrandChiffre(1486));
    }
}
