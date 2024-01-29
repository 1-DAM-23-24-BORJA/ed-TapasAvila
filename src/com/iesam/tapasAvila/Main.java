package com.iesam.tapasAvila;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.presentation.MainTapa;
import com.iesam.tapasAvila.features.tapas.presentation.MainBar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:");
            System.out.println("1. Mostrar todas las tapas");
            System.out.println("2. Mostrar una tapa por ID");
            System.out.println("3. Eliminar una tapa por ID");
            System.out.println("4. Crear una nueva tapa");
            System.out.println("5. Actualizar una tapa existente");
            System.out.println("6. Mostrar todas las informaciones del bar");
            System.out.println("7. Mostrar información del bar por ID");
            System.out.println("8. Eliminar información del bar por ID");
            System.out.println("9. Crear nueva información del bar");
            System.out.println("10. Actualizar información del bar existente");
            System.out.println("11. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    MainTapa.printTapas();
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la tapa: ");
                    String idTapa = scanner.nextLine();
                    MainTapa.printTapa(idTapa);
                    break;
                case 3:
                    System.out.print("Ingrese el ID de la tapa a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    MainTapa.deleteTapa(idEliminar);
                    break;
                case 4:
                    System.out.println("Ingrese los datos de la nueva tapa:");
                    System.out.print("ID: ");
                    String idNueva = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreNueva = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccionNueva = scanner.nextLine();
                    System.out.print("Chef: ");
                    String chefNueva = scanner.nextLine();
                    System.out.print("Ingrediente: ");
                    String ingredienteNueva = scanner.nextLine();
                    System.out.print("Alergeno: ");
                    String alergenoNuevo = scanner.nextLine();
                    System.out.print("Nombre del bar: ");
                    String nombreBarNuevo = scanner.nextLine();
                    System.out.print("URL de la foto: ");
                    String fotoNueva = scanner.nextLine();
                    System.out.print("Rating: ");
                    int ratingNueva = scanner.nextInt();
                    System.out.print("Precio: ");
                    float precioNueva = scanner.nextFloat();
                    scanner.nextLine(); // Consumir nueva línea después de nextFloat()
                    Tapa nuevaTapa = new Tapa(idNueva, nombreNueva, direccionNueva, chefNueva, ingredienteNueva, alergenoNuevo, nombreBarNuevo, fotoNueva, ratingNueva, precioNueva);
                    MainTapa.createTapa(nuevaTapa);
                    break;


                case 5:
                    System.out.println("Ingrese los nuevos datos de la tapa:");
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Chef: ");
                    String chef = scanner.nextLine();
                    System.out.print("Ingrediente: ");
                    String ingrediente = scanner.nextLine();
                    System.out.print("Alergeno: ");
                    String alergeno = scanner.nextLine();
                    System.out.print("Nombre del bar: ");
                    String nombreBar = scanner.nextLine();
                    System.out.print("URL de la foto: ");
                    String foto = scanner.nextLine();
                    System.out.print("Rating: ");
                    int rating= scanner.nextInt();
                    System.out.print("Precio: ");
                    float precio = scanner.nextFloat();
                    scanner.nextLine();
                    Tapa nuevaTapa2 = new Tapa(id, nombre, direccion, chef, ingrediente, alergeno, nombreBar, foto, rating, precio);
                    MainTapa.updateTapa(nuevaTapa2);
                    break;
                case 6:
                    MainBar.printBarInfos();
                    break;
                case 7:
                    System.out.print("Ingrese el ID del bar: ");
                    String idBar = scanner.nextLine();
                    MainBar.printBarInfo(idBar);
                    break;
                case 8:
                    System.out.print("Ingrese el ID del bar a eliminar: ");
                    String idEliminarBar = scanner.nextLine();
                    MainBar.deleteBarInfo(idEliminarBar);
                    break;
                case 9:
                    System.out.println("Ingrese los nuevos datos del bar:");
                    System.out.print("ID: ");
                    String idBarNueva = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String address = scanner.nextLine();
                    System.out.print("Propietario: ");
                    String owner = scanner.nextLine();
                    System.out.print("Horario: ");
                    String hours = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String phone = scanner.nextLine();


                    BarInfo nuevoBarInfo = new BarInfo(idBarNueva, name, address, owner, hours, phone);
                    MainBar.createBarInfo(nuevoBarInfo);
                    break;



                case 10:
                    System.out.println("Ingrese los nuevos datos del bar:");
                    System.out.print("ID: ");
                    String idBar2 = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nameBar = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String addressBar = scanner.nextLine();
                    System.out.print("Propietario: ");
                    String ownerBar = scanner.nextLine();
                    System.out.print("Horario: ");
                    String hoursBar = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String phoneBar = scanner.nextLine();
                    BarInfo nuevoBarInfo2 = new BarInfo(idBar2, nameBar, addressBar, ownerBar, hoursBar, phoneBar);
                    MainBar.updateBarInfo(nuevoBarInfo2);
                    break;
                case 11:
                    continuar = false;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
            }





