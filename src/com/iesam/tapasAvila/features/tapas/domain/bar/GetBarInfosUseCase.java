package com.iesam.tapasAvila.features.tapas.domain.bar;

import java.util.ArrayList;

public class GetBarInfosUseCase {


    private BarInfoRepository barInfoRepository;
    private String idBar;

    public GetBarInfosUseCase(BarInfoRepository barInfoRepository) {
        this.barInfoRepository = barInfoRepository;
    }

    public ArrayList<BarInfo> execute(){

        return this.barInfoRepository.obtainBarInfo(idBar);

    }






}
