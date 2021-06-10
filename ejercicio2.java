import java.util.*;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, x;
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        if (n1 >  0) {
            x = 1;
            while ( x <= n1){
                System.out.println(" ");
                System.out.print( x );
                System.out.println(" ");
                x = x + 1;
            }
        }




    } 
}