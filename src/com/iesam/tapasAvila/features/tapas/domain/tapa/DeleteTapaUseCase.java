package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public class DeleteTapaUseCase {


    private TapaRepository tapaRepository ;
    public DeleteTapaUseCase(TapaRepository tapaRepository){

        this.tapaRepository= null;

    }

    public ArrayList<Tapa> execute(){

        return this.tapaRepository.deleteTapa();

    }



}
