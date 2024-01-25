package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;

import java.util.ArrayList;

public class GetTapaUseCase {
    private TapaDataRepository tapaDataRepository;



    public GetTapaUseCase(TapaDataRepository tapaDataRepository) {
        this.tapaDataRepository = tapaDataRepository;
    }


    public ArrayList<Tapa> execute() {
        return this.tapaDataRepository.obtainTapa();
    }
}


