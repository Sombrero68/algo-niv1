import java.util.Scanner;



public class exo3 {
        public static void main(String[] args) {

            Scanner clavier = new Scanner(System.in);
            

            System.out.println("valeur de a :");

            int a = clavier.nextInt();

      
            System.out.println("valeur de b :");

            int b = clavier.nextInt();

            if (a<b) {
                System.out.println("a est inférieur a b"); //message vrai
            } else {
                System.out.println("a est supérieur ou égal à b"); //message faux
            }
    
            
    
        
    }
}
