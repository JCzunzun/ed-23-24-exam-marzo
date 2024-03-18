package com.iesam.ryanair.features.aviones.data;

import com.iesam.ryanair.features.aviones.data.local.AvionLocalDataSource;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {
    private AvionLocalDataSource avionLocalDataSource;
    public AvionDataRepository(){
        avionLocalDataSource= new AvionLocalDataSource();
    }
    @Override
    public void saveAvion(Avion avion) {
        avionLocalDataSource.save(avion);
    }

    @Override
    public Avion obtainAvion(String cod) {
        return avionLocalDataSource.obtain(cod);
    }
}
