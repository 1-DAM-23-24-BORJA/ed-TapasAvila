package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private ArrayList<Tapa> localTapas = new ArrayList<>();
    public TapaDataRepository(){
        initData();
    }

    public ArrayList<Tapa> obtipeTapa() {
        return localTapas;
    }
    public ArrayList<Tapa> deleteTapas() {
        return null;
    }

    @Override
    public ArrayList<Tapa> obtipeTapa(String petId) {
        return null;
    }

    public Tapa obtainTapa(String id) {
        for (Tapa tapa : localTapas) {
            if (tapa.getId().equals(id)) {
                return tapa;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Tapa> deleteTapa() {

        return null;
    }

    @Override
    public void deleteTapa(Tapa tapa) {

    }

    @Override
    public void deleteTapa(String id) {

    }


    public void saveTapa(Tapa tapa) {

    }


    public void updateTapa(Tapa tapa) {

    }

    private void initData() {
        localTapas.add(new Tapa("tapa1","ww","","","","","",3,4,""));
        localTapas.add(new Tapa("tapa1","ww","","","","","",3,4,""));
    }










}
