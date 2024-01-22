package com.iesam.tapasAvila.features.tapas.domain.bar;

import java.util.ArrayList;

public interface BarInfoRepository {

    ArrayList<BarInfo>  obtainBarInfo(String idBar);
    ArrayList<BarInfo> deleteBarInfo();
    void deleteBarInfo(BarInfo barInfo);
    void saveBarInfo(BarInfo barInfo);
    void updateBarInfo(BarInfo barInfo);


}
