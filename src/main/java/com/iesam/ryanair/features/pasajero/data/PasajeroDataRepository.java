package com.iesam.ryanair.features.pasajero.data;

import com.iesam.ryanair.features.pasajero.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.domain.PasajeroRepository;

public class PasajeroDataRepository implements PasajeroRepository {
    private PasajeroFileLocalDataSource pasajeroFileLocalDataSource;
    public PasajeroDataRepository(){
        pasajeroFileLocalDataSource=new PasajeroFileLocalDataSource();
    }
    @Override
    public void savePasajero(Pasajero pasajero) {
        pasajeroFileLocalDataSource.save(pasajero);
    }

    @Override
    public Pasajero obtainPasajero(String dni) {
        return pasajeroFileLocalDataSource.obtain(dni);
    }
}
