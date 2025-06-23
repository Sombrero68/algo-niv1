import java.util.Scanner;


public class compteur {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("valeur de a");
        int a = clavier.nextInt(); 
        System.out.println("valeur de b");
        int b = clavier.nextInt();
        if (a<b) {
            System.out.println("si a est inférieur a b");
            for(int i = a;i<b;i++)
            System.out.println("a inférieur à b");
                System.out.println(i);

            
        }

   

    }
    
}
