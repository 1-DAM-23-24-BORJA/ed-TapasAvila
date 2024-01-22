package com.iesam.tapasAvila.features.tapas.domain.bar;

public class SaveBarInfoUseCase {


    private BarInfoRepository barInfoRepository;

    public SaveBarInfoUseCase(SaveBarInfoUseCase saveBarInfoUseCase){
        this.barInfoRepository = barInfoRepository;
    }

    public void execute(BarInfo barInfo){
        this.barInfoRepository.saveBarInfo(barInfo);
    }







}
