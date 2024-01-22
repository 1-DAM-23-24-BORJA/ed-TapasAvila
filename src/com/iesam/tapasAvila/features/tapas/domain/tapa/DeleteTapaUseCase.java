package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public class DeleteTapaUseCase {


    private DeleteTapaUseCase DeleteTapaUseCase;
    public DeleteTapaUseCase(TapaRepository tapaRepository){

        this.DeleteTapaUseCase= null;

    }

    public ArrayList<Tapa> execute(String id){

        return this.DeleteTapaUseCase.execute(id);

    }



}
