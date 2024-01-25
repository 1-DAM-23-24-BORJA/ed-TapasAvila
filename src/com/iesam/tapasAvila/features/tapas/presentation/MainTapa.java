package com.iesam.tapasAvila.features.tapas.presentation;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.tapa.*;

import java.util.ArrayList;

public class MainTapa {

    private static TapaRepository TapaDataRepository;

    public static void printTapas(){
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        System.out.println(tapas.toString());
    }

    public static void printTapa(String id){
        GetTapaUseCase getTapaUseCase= new GetTapaUseCase(new TapaDataRepository());
        Tapa tapa = getTapaUseCase.execute(id);
        System.out.println(tapa.toString());
    }
    public static void deleteTapa(String id){
        TapaDataRepository tapaDataRepository = new TapaDataRepository();
        //Antes de eliminar
        GetTapasUseCase getTapasUseCase = new GetTapasUseCase(tapaDataRepository);
        ArrayList<Tapa> tapasBeforeDelete = getTapasUseCase.execute();

        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(tapaDataRepository);
        deleteTapaUseCase.execute();

        //Después de eliminar
        ArrayList<Tapa> tapasAfterDelete = getTapasUseCase.execute();
    }


    public static void deleteTapaNotWorking(String id){
        printTapas();
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository);
       deleteTapaUseCase.execute();
       printTapas();
    }





}
