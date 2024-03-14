package com.iesam.ryanair.features.empleados.domain;

public interface EmpleadoRepository {
    void saveEmpleado(Empleado empleado);
    Empleado obtainEmpleado(String dni);
}
