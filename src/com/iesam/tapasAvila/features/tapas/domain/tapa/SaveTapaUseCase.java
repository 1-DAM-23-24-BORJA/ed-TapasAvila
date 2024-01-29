package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;

public class SaveTapaUseCase {

    private TapaRepository tapaRepository;

    public SaveTapaUseCase(TapaDataRepository tapaRepository){

        this.tapaRepository= tapaRepository;

    }

   public  void execute(Tapa tapa){
        this.tapaRepository.saveTapa(tapa);
   }


}
