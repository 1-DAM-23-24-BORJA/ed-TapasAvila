package com.iesam.tapasAvila.features.tapas.presentation;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.tapa.*;

import java.util.ArrayList;

public class MainTapa {



    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        //imprimir cada una de las mascotas
        System.out.println(tapas.toString());
    }


    public static void printTapa(String id) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(id);
        System.out.println(tapa.toString());
    }


    public static void deleteTapa(String id){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(id);
    }

    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    public static void updateTapa(Tapa tapa){
        UpdateTapaUseCase updatePetUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updatePetUseCase.execute(tapa);

        System.out.println("");
    }



}
