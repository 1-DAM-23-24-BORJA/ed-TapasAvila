package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfoRepository;

import java.util.ArrayList;

public class GetTapaUseCase {
    private TapaDataRepository tapaDataRepository;
    private String id;


    public GetTapaUseCase(TapaDataRepository tapaDataRepository) {
        this.tapaDataRepository = tapaDataRepository;
    }


    public Tapa execute(String id){

        return this.tapaDataRepository.obtainTapa(id);

    }

}


