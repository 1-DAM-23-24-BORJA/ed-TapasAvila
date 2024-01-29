package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;
import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfoRepository;

import java.util.ArrayList;




public class BarInfoDataRepository implements BarInfoRepository {
    private ArrayList<BarInfo> localBarInfo = new ArrayList<>();
    private static BarInfoDataRepository instance = null;
    public BarInfoDataRepository() {
        initData();
    }

    @Override
    public ArrayList<BarInfo> obtainBarInfos() {
        return localBarInfo;
    }

    @Override
    public ArrayList<BarInfo> obtainBarInfo() {
        return null;
    }

    public BarInfo obtainBarInfo(String IdBar) {
        for (BarInfo barInfo : localBarInfo) {
            if (barInfo.getIdBar().equals(IdBar)) {
                return barInfo;
            }
        }
        return null;
    }

    public void deleteBarInfo(String IdBar) {
        for (int i = 0; i < localBarInfo.size(); i++) {
            if (localBarInfo.get(i).getIdBar().equals(IdBar))
                localBarInfo.remove(i);
        }
    }

    @Override
    public void saveBarInfo(BarInfo BarInfo) {

    }

    @Override
    public void savelocalBarInfo(BarInfo barInfo) {
        localBarInfo.add(barInfo);
    }
    @Override
    public void updateBarInfo(BarInfo barInfo) {
        deleteBarInfo(barInfo.getIdBar());
        saveBarInfo(barInfo);


    }

    private void initData() {
        localBarInfo.add(new BarInfo("u","","", "","",""));
        localBarInfo.add(new BarInfo("u","","", "","",""));
    }

    public static BarInfoDataRepository newInstance(){

        if (instance == null){
            instance= new BarInfoDataRepository();
        }
        return instance;
    }


    }


