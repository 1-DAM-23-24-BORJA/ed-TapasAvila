package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;

import java.util.ArrayList;

public class GetTapaUseCase {
    private TapaRepository tapaRepository;



    public GetTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }


  public  Tapa execute(String id){
        return  this.tapaRepository.obtainTapa(id);
  }
}


