package com.iesam.ryanair.features.aviones.domain;

public class SaveAvionUseCase {
    private final AvionRepository avionRepository;

    public SaveAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }
    public void save(Avion avion){
        avionRepository.saveAvion(avion);
    }
}
