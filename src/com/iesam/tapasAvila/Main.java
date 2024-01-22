package com.iesam.tapasAvila;

import com.iesam.tapasAvila.features.tapas.presentation.MainTapa;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menú de Gestión de Tapas");
            System.out.println("1. Mostrar todas las tapas");
            System.out.println("2. Mostrar una tapa por ID");
            System.out.println("3. Eliminar una tapa por ID");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    MainTapa.printTapas();
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la tapa: ");
                    String tapaId = scanner.nextLine();
                    MainTapa.printTapa(tapaId);
                    break;
                case 3:
                    System.out.print("Ingrese el ID de la tapa a eliminar: ");
                    String deleteTapaId = scanner.nextLine();
                    MainTapa.deleteTapa(deleteTapaId);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (choice != 4);

        scanner.close();
    }
}





