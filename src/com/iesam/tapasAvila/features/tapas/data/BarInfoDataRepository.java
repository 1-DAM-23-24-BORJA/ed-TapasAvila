package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;

import java.util.ArrayList;

public class BarInfoDataRepository {


    private ArrayList<BarInfo> localBarInfo = new ArrayList<>();
    public BarInfoDataRepository(){
        initData();
    }



    public ArrayList<BarInfo> obtipeBarInfo(String idBarInfo) {
        return localBarInfo;
    }


    public ArrayList<BarInfo> deleteBarInfo() {
        return null;
    }


    public BarInfo obtainBarInfo(String idBarInfo) {
        for (BarInfo barInfo : localBarInfo) {
            if (barInfo.getIdBar().equals(idBarInfo)) {
                return barInfo;
            }
        }
        return null;
    }


    public void deleteBarInfo(String idBarInfo) {

    }


    public void saveBarInfo(BarInfo barInfo) {

    }


    public void updateBarInfo(BarInfo barInfo) {

    }










    private void initData() {
        localBarInfo.add(new BarInfo("","","", "","",""));
        localBarInfo.add(new BarInfo("","","", "","",""));
    }





}
