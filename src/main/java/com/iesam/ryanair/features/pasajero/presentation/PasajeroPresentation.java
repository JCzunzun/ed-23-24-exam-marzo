package com.iesam.ryanair.features.pasajero.presentation;

import com.iesam.ryanair.features.pasajero.data.PasajeroDataRepository;
import com.iesam.ryanair.features.pasajero.domain.GetPasajeroUseCase;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.domain.SavePasajeroUseCase;

public class PasajeroPresentation {
    public void savePasajero(Pasajero pasajero){
        SavePasajeroUseCase savePasajeroUseCase= new SavePasajeroUseCase(new PasajeroDataRepository());
        savePasajeroUseCase.save(pasajero);
    }
    public Pasajero obtainPasajero(String dni){
        GetPasajeroUseCase getPasajeroUseCase= new GetPasajeroUseCase(new PasajeroDataRepository());
        return getPasajeroUseCase.obtain(dni);
    }
}
