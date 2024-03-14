package com.iesam.ryanair.features.vuelo.domain;

public class SaveVueloUseCase {
    private final VueloRepository vueloRepository;

    public SaveVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public void saveVuelo(Vuelo vuelo){
        vueloRepository.saveVuelo(vuelo);
    }
}
