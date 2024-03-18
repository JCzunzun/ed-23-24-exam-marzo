package com.iesam.ryanair.features.pasajero.domain;

public class GetPasajeroUseCase {
    private final PasajeroRepository pasajeroRepository;

    public GetPasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }
    public Pasajero obtain(String dni){
        return pasajeroRepository.obtainPasajero(dni);
    }
}
