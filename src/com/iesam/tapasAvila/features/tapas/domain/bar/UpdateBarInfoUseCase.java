package com.iesam.tapasAvila.features.tapas.domain.bar;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

public class UpdateBarInfoUseCase {

    private BarInfoRepository barInfoRepository;
    public  UpdateBarInfoUseCase(BarInfoRepository barInfoRepository){
        this.barInfoRepository= barInfoRepository;
    }
    public  void execute(BarInfo barInfo){

        this.barInfoRepository.updateBarInfo(barInfo);


    }




}
