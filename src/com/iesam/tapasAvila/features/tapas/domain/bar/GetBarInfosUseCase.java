package com.iesam.tapasAvila.features.tapas.domain.bar;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

import java.util.ArrayList;

public class GetBarInfosUseCase {


    private BarInfoRepository BarInfoRepository;


    public GetBarInfosUseCase(BarInfoRepository BarInfoRepository) {
        this.BarInfoRepository = BarInfoRepository;
    }

    public ArrayList<BarInfo> execute() {
        return  BarInfoRepository.obtainBarInfo();
    }
}





