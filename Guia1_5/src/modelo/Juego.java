package modelo;

import java.util.Scanner;

public class Juego {

    private final int cantIntentosMax;
    private final int cantDigitos;

    public Juego(int cantIntentosMax, int cantDigitos) {
        this.cantIntentosMax = cantIntentosMax;
        this.cantDigitos = cantDigitos;
    }

    public void jugar() {
        CodigoSecreto codigoSecreto = new CodigoSecreto(cantDigitos);
        int cantIntentos = 0;
        boolean adivino = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tenes " + cantIntentosMax + " intentos para adivinar el codigo de " + cantDigitos + " digitos!\n");

        while (cantIntentos < cantIntentosMax && !adivino) {
            System.out.print("Ingresa tu " + (cantIntentos + 1) + "º intento: ");
            String intento = sc.nextLine();
            String respuesta = codigoSecreto.adivinar(intento);

            if (respuesta.charAt(cantDigitos + 6) == cantDigitos + '0') {
                adivino = true;
            } 
            else {
                System.out.println(respuesta + "\n");
            }

            cantIntentos++;
        }

        if (adivino) {
            System.out.println("\nGanaste!!!");
        } 
        else {
            System.out.println("\nTe quedaste sin intentos, perdiste :(");
        }
    }
}
