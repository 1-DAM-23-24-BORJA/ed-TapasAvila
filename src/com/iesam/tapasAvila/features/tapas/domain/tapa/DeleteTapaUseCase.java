package com.iesam.tapasAvila.features.tapas.domain.tapa;

import com.iesam.tapasAvila.features.tapas.data.TapaDataRepository;

public class DeleteTapaUseCase {
    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaDataRepository) {
        this.tapaRepository = tapaDataRepository;
    }

    public void execute(String id){
        tapaRepository.deleteTapa(id);
    }}