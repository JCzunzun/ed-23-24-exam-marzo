package com.iesam.ryanair.features.aviones.domain;

public class GetAvionUseCase {
    private final AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }
    public Avion obtain(String cod){
        return avionRepository.obtainAvion(cod);
    }
}
