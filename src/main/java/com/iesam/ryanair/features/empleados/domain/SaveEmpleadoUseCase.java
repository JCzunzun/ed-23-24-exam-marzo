package com.iesam.ryanair.features.empleados.domain;

public class SaveEmpleadoUseCase {
    private final EmpleadoRepository empleadoRepository;

    public SaveEmpleadoUseCase(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    public void save(Empleado empleado){
        empleadoRepository.saveEmpleado(empleado);
    }
}
