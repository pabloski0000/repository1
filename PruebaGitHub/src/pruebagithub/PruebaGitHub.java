package pruebagithub;

import java.util.Scanner;

public class PruebaGitHub {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero1,numero2,resta=0;
                
        System.out.print("Debes escribir un número para restarlo: ");
        numero1=leer.nextInt();
        System.out.print("\n\nDebes escribir el segundo: ");
        numero2=leer.nextInt();
        
        resta=numero1 - numero2;
        
        System.out.println("El total de la suma es = "+resta);
    }
    
}
