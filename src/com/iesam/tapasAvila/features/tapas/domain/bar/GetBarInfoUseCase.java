package com.iesam.tapasAvila.features.tapas.domain.bar;

public class GetBarInfoUseCase {


    private BarInfoRepository barInfoRepository;
    private String idBar;

    public GetBarInfoUseCase(BarInfoRepository barInfoRepository){

        this.barInfoRepository= barInfoRepository;

    }

    public BarInfo execute(String petId){


        return this.barInfoRepository.obtainBarInfo(idBar);

    }



}
