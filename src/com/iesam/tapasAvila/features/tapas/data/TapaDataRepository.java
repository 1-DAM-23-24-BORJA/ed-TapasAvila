package com.iesam.tapasAvila.features.tapas.data;

import com.iesam.tapasAvila.features.tapas.domain.tapa.Tapa;
import com.iesam.tapasAvila.features.tapas.domain.tapa.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private static TapaDataRepository instance = null;

    private ArrayList<Tapa> localTapas = new ArrayList<>();

    public TapaDataRepository() {
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }
    public Tapa obtainTapa(String id) {
        for (Tapa tapa : localTapas) {
            if (tapa.getId().equals(id)) {
                return tapa;
            }
        }
        return null;
    }

    public void deleteTapa(String id) {
        for (int i = 0; i < localTapas.size(); i++) {
            if (localTapas.get(i).getId().equals(id))
                localTapas.remove(i);
        }
    }
    @Override
    public void saveTapa(Tapa tapa) {
        localTapas.add(tapa);
    }
    @Override
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId());
        saveTapa(tapa);


    }

    private void initData() {
        localTapas.add(new Tapa("tapa1", "ww", "3", "3", "3", "3", "3", 3, 4, "1"));
        localTapas.add(new Tapa("tapa1", "ww", "", "", "", "", "", 3, 4, "2"));
    }

    public static TapaDataRepository newInstance(){
        if (instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }
}











