package com.iesam.tapasAvila.features.tapas.domain.bar;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;

import java.util.ArrayList;

public interface BarInfoRepository {

    ArrayList<BarInfo> obtainBarInfos();

    ArrayList<BarInfo> obtainBarInfo();
    BarInfo obtainBarInfo(String idBar);
    void deleteBarInfo(String idBar);
    void saveBarInfo(BarInfo BarInfo);

    void savelocalBarInfo(BarInfo barInfo);

    void updateBarInfo(BarInfo BarInfo);


}
