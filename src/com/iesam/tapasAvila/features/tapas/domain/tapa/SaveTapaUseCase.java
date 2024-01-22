package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfoRepository;
import com.iesam.tapasAvila.features.tapas.domain.bar.SaveBarInfoUseCase;

public class SaveTapaUseCase {

    private TapaRepository tapaRepository;

    public SaveTapaUseCase(SaveTapaUseCase saveTapaUseCase){
        this.tapaRepository = saveTapaUseCase.tapaRepository;
    }



}
