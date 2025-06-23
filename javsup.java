import java.util.Scanner;

public class javsup {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("valeur de a");

        int a =  clavier.nextInt();
        
        System.out.println("valeur de b");

        int b =  clavier.nextInt();
        if (a>b) {
            System.out.println("a est supérieur a 10"); //message vrai
            
        }else{
            System.out.println("a est inférieur a 10"); //message faux 
        }
    }
}
