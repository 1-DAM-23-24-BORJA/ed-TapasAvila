package com.iesam.tapasAvila.features.tapas.presentation;

import com.iesam.tapasAvila.features.tapas.data.BarInfoDataRepository;
import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;
import com.iesam.tapasAvila.features.tapas.domain.bar.*;
import com.iesam.tapasAvila.features.tapas.domain.tapa.*;

import java.util.ArrayList;

public class MainBar {



    public static void printBarInfos() {
        GetBarInfosUseCase barInfosUseCase = new GetBarInfosUseCase(BarInfoDataRepository.newInstance());
        ArrayList<BarInfo> barInfos = barInfosUseCase.execute();
        System.out.println(barInfos.toString());
    }


    public static void printBarInfo(String idBar) {
        GetBarInfoUseCase getBarInfoUseCase = new GetBarInfoUseCase(BarInfoDataRepository.newInstance());
        BarInfo barInfo = getBarInfoUseCase.execute(idBar);
        System.out.println(barInfo.toString());
    }


    public static void deleteBarInfo(String idBar){
        DeleteBarInfoUseCase deleteBarInfoUseCase = new DeleteBarInfoUseCase((TapaRepository) BarInfoDataRepository.newInstance());
        deleteBarInfoUseCase.execute(idBar);
    }

    public static void createBarInfo(BarInfo barInfo){
        BarInfoDataRepository barInfoDataRepository = BarInfoDataRepository.newInstance();
        SaveBarInfoUseCase saveBarInfoUseCase = new SaveBarInfoUseCase(barInfoDataRepository);
        saveBarInfoUseCase.execute(barInfo);
    }

    public static void updateBarInfo(BarInfo barInfo){
        UpdateBarInfoUseCase updateBarInfoUseCase = new UpdateBarInfoUseCase(BarInfoDataRepository.newInstance());
        updateBarInfoUseCase.execute(barInfo);

        System.out.println("");
    }


}
