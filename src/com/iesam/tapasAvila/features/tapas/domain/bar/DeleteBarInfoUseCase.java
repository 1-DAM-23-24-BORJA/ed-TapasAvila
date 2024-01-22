package com.iesam.tapasAvila.features.tapas.domain.bar;

import java.util.ArrayList;

public class DeleteBarInfoUseCase {

    private BarInfoRepository barInfoRepository;
    public DeleteBarInfoUseCase(BarInfoRepository barInfoRepository){

        this.barInfoRepository= null;

    }

    public ArrayList<BarInfo> execute(){

        return this.barInfoRepository.deleteBarInfo();

    }






}
