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
/*

    public static void deletePet(String petId){
        DeletePetUseCase deletePetUseCase = new DeletePetUseCase(PetDataRepository.newInstance());
        deletePetUseCase.execute(petId);
    }

    public static void createPet(Pet pet){
        PetDataRepository petDataRepository = PetDataRepository.newInstance();
        SavePetUseCase savePetUseCase = new SavePetUseCase(petDataRepository);
        savePetUseCase.execute(pet);
    }

    public static void updatePet(Pet pet){
        UpdatePetUseCase updatePetUseCase = new UpdatePetUseCase(PetDataRepository.newInstance());
        updatePetUseCase.execute(pet);

        System.out.println("");
    }
*/


}
