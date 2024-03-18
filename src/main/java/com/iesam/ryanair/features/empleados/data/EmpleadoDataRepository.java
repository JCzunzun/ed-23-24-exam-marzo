package com.iesam.ryanair.features.empleados.data;

import com.iesam.ryanair.features.empleados.data.local.EmpleadoLocalDataSource;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {
    private EmpleadoMemLocalDataSource instancia= new EmpleadoMemLocalDataSource().newInstance();
    @Override
    public void saveEmpleado(Empleado empleado) {
        instancia.saveEmpleados(empleado);
    }

    @Override
    public Empleado obtainEmpleado(String dni) {
        return instancia.obtainEmpleado(dni);
    }
}
