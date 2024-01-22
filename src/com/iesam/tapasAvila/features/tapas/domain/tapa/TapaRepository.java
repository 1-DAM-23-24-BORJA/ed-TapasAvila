package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.domain.bar.BarInfo;

import java.util.ArrayList;

public interface TapaRepository {



    ArrayList<Tapa> obtainTapa(String id);
    ArrayList<Tapa> deleteTapa();
    void deleteTapa(Tapa tapa);
    void saveTapa(Tapa tapa);
    void updateTapa(Tapa tapa);














}
