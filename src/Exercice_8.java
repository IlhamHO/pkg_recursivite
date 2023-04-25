import eu.epfc.prm2.Array;

public class Exercice_8 {
    public static int sumArray(Array<Integer>n , int index){
        if(index == n.size()-1) return n.get(n.size()-1);
        else {
            return n.get(index) + sumArray(n , index+1);
            //à éviter car je détruie le tableau
            /* int tmp = n.get(n.size()-1);
            n.reduceTo(n.size()-1);
            return tmp+sumArray(n);*/
        }
    }

    public static int sum(Array<Integer> n){
        return sumArray(n, 0);
    }

    public static void main(String[] args) {
        Array<Integer> nombres = new Array<>(1,4,5,3,5);
        System.out.println(sum(nombres));
    }

}
