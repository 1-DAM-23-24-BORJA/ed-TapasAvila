package com.iesam.tapasAvila.features.tapas.domain.bar;

public class GetBarInfoUseCase {


    private BarInfoRepository barInfoRepository;



    public GetBarInfoUseCase(BarInfoRepository barInfoRepository) {
        this.barInfoRepository = barInfoRepository;
    }


    public BarInfo execute(String id){
        return  this.barInfoRepository.obtainBarInfo(id);
    }



}
