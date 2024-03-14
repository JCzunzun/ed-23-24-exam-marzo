package com.iesam.ryanair.features.aviones.domain;

public class Avion {
    private final String codAvion;
    private final String nombre;
    private final String modelo;
    private final String asientos;

    public Avion(String codAvion, String nombre, String modelo, String asientos) {
        this.codAvion = codAvion;
        this.nombre = nombre;
        this.modelo = modelo;
        this.asientos = asientos;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAsientos() {
        return asientos;
    }
}
