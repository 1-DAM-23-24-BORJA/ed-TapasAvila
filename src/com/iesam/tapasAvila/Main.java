package com.iesam.tapasAvila;

import com.iesam.tapasAvila.features.tapas.presentation.MainTapa;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        int numero;
        String id;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menú de Gestión de Tapas");
            System.out.println("1. Mostrar todas las tapas");
            System.out.println("2. Mostrar una tapa por ID");
            System.out.println("3. Eliminar una tapa por ID");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            numero = scanner.nextInt();


            switch (numero) {
                case 1:
                    MainTapa.printTapas();

                    break;
                case 2:
                    System.out.print("Ingrese el ID de la tapa: ");
                     id = scanner.nextLine();

                    break;
                case 3:
                    System.out.print("Ingrese el ID de la tapa a eliminar: ");
                    id = scanner.nextLine();

                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (numero != 4);

        scanner.close();
    }
}





