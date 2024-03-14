package com.iesam.ryanair.features.pasajero.domain;

public interface PasajeroRepository {
    void savePasajero(Pasajero pasajero);
    Pasajero obtainPasajero(String dni);
}
