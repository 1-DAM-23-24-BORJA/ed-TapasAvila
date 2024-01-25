package com.iesam.tapasAvila.features.tapas.presentation;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.tapa.*;

import java.util.ArrayList;

public class MainTapa {

    private static TapaRepository TapaDataRepository;

    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas = tapasUseCase.execute();

        if (tapas != null) {
            System.out.println(tapas.toString());
        } else {
            System.out.println("La lista de tapas está vacía o es nula.");
        }
    }




}
