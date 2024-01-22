package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public class GetTapasUseCase {
    private TapaRepository tapaRepository;
    private String idBar;

    public GetTapasUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(String id){

        return this.tapaRepository.obtainTapa(id);

    }


    public ArrayList<Tapa> execute() {
        return  null;
    }
}
