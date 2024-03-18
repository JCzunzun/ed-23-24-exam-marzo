package com.iesam.ryanair.features.pasajero.domain;

public class SavePasajeroUseCase {
    private final PasajeroRepository pasajeroRepository;

    public SavePasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }
    public void save(Pasajero pasajero){
        pasajeroRepository.savePasajero(pasajero);
    }
}
