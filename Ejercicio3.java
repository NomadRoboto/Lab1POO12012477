

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);


        int n;
        int z;

        System.out.print("Por favor ingrese el primer número a evaluar: ");
        n = teclado.nextInt();
        System.out.print("Por favor ingrese el segundo número a evaluar: ");
        z=teclado.nextInt();

        if(n>0 && z>0) 
            System.out.println( "VERDADERO");



}

    }
