package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public interface TapaRepository {


    ArrayList<Tapa> obtipeTapa();

    ArrayList<Tapa> obtipeTapa(String petId);

    ArrayList<Tapa> obtainTapa(String id);
    ArrayList<Tapa> deleteTapa();

    void deleteTapa(Tapa tapa);

    void deleteTapa(String id);
    void saveTapa(Tapa tapa);
    void updateTapa(Tapa tapa);














}
