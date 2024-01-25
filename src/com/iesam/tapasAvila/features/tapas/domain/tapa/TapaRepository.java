package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public interface TapaRepository {



    ArrayList<Tapa> obtainTapa();
    Tapa obtainTapa(String id);
    void deleteTapa(String id);
    void saveTapa(Tapa tapa);

    void updateTapa(Tapa tapa);
}
