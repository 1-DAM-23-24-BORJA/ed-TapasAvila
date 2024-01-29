package com.iesam.tapasAvila.features.tapas.domain.bar;

import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

import java.util.ArrayList;

public class DeleteBarInfoUseCase {

    private BarInfoRepository BarInfoRepository;

    public DeleteBarInfoUseCase(TapaRepository tapaRepository) {
        this.BarInfoRepository = BarInfoRepository;
    }

    public void execute(String idBarInfo){
        BarInfoRepository.deleteBarInfo(idBarInfo);
    }





}
