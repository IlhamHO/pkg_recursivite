import eu.epfc.prm2.Array;

public class Exercice_9 {
    public static boolean cherche(Array<Integer> n , int val){
        int bi = 0;
        int bs = n.size();
        int m = (bi+bs)/2;
        while(bi<bs && n.get(m)!=val){
            if(val<n.get(m)) bs = m;
            else bi = m + 1;
            m = (bi+bs)/2;
        }
        return bi<bs;
    }

    public static void main(String[] args) {
        Array<Integer> nombres = new Array<>(1,8,12,27,50,69,81,98,102);
        System.out.println(cherche(nombres,52));
    }
}
