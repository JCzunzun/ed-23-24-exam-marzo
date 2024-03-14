package com.iesam.ryanair.features.aviones.domain;

public interface AvionRepository {
    void saveAvion(Avion avion);
    Avion obtainAvion(String cod);
}
