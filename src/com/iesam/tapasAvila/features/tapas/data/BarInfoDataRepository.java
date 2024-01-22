package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;

import java.util.ArrayList;

public class BarInfoDataRepository {


    private ArrayList<BarInfo> localBarInfo = new ArrayList<>();
    public BarInfoDataRepository(){
        initData();
    }










    private void initData() {
        localBarInfo.add(new BarInfo("","","", "","",""));
        localBarInfo.add(new BarInfo("","","", "","",""));
    }





}
