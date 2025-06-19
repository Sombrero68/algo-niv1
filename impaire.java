import java.util.Scanner;

public class impaire {
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
            

           
            System.out.println("valeur de a :");

            int a = clavier.nextInt();

            if (a%2 == 0) {
                System.out.println("c'est pair");
                
                
            }else{
                System.out.println("c'est impair");
            }
    }
    


    /* Vérifier si une variable est paire ou impaire vous aurez besoin de la condition variable %(modulo) 2 == 0 , si c'est vrai donc c'est pair sinon c'est impair*/

}
