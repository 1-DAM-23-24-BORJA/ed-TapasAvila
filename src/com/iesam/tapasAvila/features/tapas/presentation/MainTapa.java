package com.iesam.tapasAvila.features.tapas.presentation;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.tapa.*;

import java.util.ArrayList;

public class MainTapa {

    private static TapaRepository TapaDataRepository;

    public static void printTapas(){
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapa = tapasUseCase.execute();
        //imprimir cada una de las mascotas
        System.out.println(tapa.toString());
    }

    public static void printTapa(String id){
        GetTapaUseCase getTapaUseCase= new GetTapaUseCase(new TapaDataRepository());
        var tapa = (Tapa) getTapaUseCase.execute(id);
        System.out.println(tapa.toString());
    }
    public static void deleteTapa(String id){
        TapaDataRepository tapaDataRepository = new TapaDataRepository();
        //Antes de eliminar
        GetTapasUseCase getTapasUseCase = new GetTapasUseCase(tapaDataRepository);
        ArrayList<Tapa> tapasBeforeDelete = getTapasUseCase.execute();

        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(tapaDataRepository);
        deleteTapaUseCase.execute(id);

        //Después de eliminar
        ArrayList<Tapa> tapasAfterDelete = getTapasUseCase.execute();
    }


    public static void deleteTapaNotWorking(String id){
        printTapas();
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository);
       deleteTapaUseCase.execute(id);
       printTapas();
    }





}
