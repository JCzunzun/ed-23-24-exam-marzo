package com.iesam.ryanair.features.vuelo.domain;

public class GetVueloUseCase {
    private final VueloRepository vueloRepository;

    public GetVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public Vuelo obtainVuelo(String cod){
        return vueloRepository.obtainVuelo(cod);
    }
}
