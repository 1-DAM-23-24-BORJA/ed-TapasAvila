package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;

import java.util.ArrayList;

public interface TapaRepository {


    ArrayList<Tapa> obtainTapas();
    Tapa obtainTapa(String id);
    void deleteTapa(String id);
    void saveTapa(Tapa tapa);

    void updateTapa(Tapa tapa);


}
