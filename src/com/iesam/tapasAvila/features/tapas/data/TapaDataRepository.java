package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private ArrayList<Tapa> localTapas = new ArrayList<>();
    public TapaDataRepository(){
        initData();
    }










    private void initData() {
        localTapas.add(new Tapa("tapa1","ww","","","","","",3,4,""));
        localTapas.add(new Tapa("tapa1","ww","","","","","",3,4,""));
    }










}
