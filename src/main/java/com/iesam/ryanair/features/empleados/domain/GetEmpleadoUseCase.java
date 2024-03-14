package com.iesam.ryanair.features.empleados.domain;

public class GetEmpleadoUseCase {
    private final EmpleadoRepository empleadoRepository;

    public GetEmpleadoUseCase(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    public Empleado obtain(String dni){
        return empleadoRepository.obtainEmpleado(dni);
    }
}
