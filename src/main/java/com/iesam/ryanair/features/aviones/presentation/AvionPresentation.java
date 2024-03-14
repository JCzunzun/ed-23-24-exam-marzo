package com.iesam.ryanair.features.aviones.presentation;

import com.iesam.ryanair.features.aviones.data.AvionDataRepository;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.GetAvionUseCase;
import com.iesam.ryanair.features.aviones.domain.SaveAvionUseCase;

public class AvionPresentation {
    public void saveAvion(Avion avion){
        SaveAvionUseCase saveAvionUseCase= new SaveAvionUseCase(new AvionDataRepository());
        saveAvionUseCase.save(avion);
    }
    public Avion obtainAvion(String id) {
        GetAvionUseCase getAvionUseCase = new GetAvionUseCase(new AvionDataRepository());
        return getAvionUseCase.obtain(id);
    }
}
