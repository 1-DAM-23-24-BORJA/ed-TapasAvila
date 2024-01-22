package com.iesam.tapasAvila.features.tapas.domain.bar;

import java.util.ArrayList;

public class GetBarInfoUseCase {


    private BarInfoRepository barInfoRepository;
    private String idBar;

    public GetBarInfoUseCase(BarInfoRepository barInfoRepository){

        this.barInfoRepository= barInfoRepository;

    }

    public ArrayList<BarInfo> execute(String idBar) {


        return this.barInfoRepository.obtainBarInfo(idBar);
    }



}
