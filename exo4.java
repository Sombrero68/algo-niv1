import java.util.Scanner;



public class exo4 {
        public static void main(String[] args) {

            Scanner clavier = new Scanner(System.in);
            

           

      
            System.out.println("valeur de b :");

            int b = clavier.nextInt();

            System.out.println("valeur de a :");

            int a = clavier.nextInt();

            if(a<b){

                System.out.println("a inférieur à b");

                      for(int i = a;i<b;i++){
                        System.out.println("a inférieur à b");
                System.out.println(i);


            }
            

                /* Boucle incrément */


            }else{

                System.out.println("a supérieur ou égal à b");

                for(int i = a;i>=b;i--){
                   
                    System.out.println(i);
    
    
                }
                
                /* Boucle décrément */

            }

            for(int i = a;i<=b;i++){

                System.out.println(i);


            }


        }

            

}
