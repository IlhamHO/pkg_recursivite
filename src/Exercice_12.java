public class Exercice_12 {
    public static void nbRenverse(int n){
       if(n<10) System.out.println(n);
       else{
           System.out.print(n%10);
           nbRenverse(n/10);
       }
    }

    public static void main(String[] args) {
        nbRenverse(1234);
    }
}
