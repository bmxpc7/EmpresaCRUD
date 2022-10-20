package com.example.Empresa.service.impl;

import com.example.Empresa.commons.GenericServiceImpl;
import com.example.Empresa.dao.api.EmpleadoRepo;
import com.example.Empresa.model.Empleado;
import com.example.Empresa.service.api.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Long> implements EmpleadoService {
    @Autowired
    private EmpleadoRepo empleadoRepo;
    @Override
    public CrudRepository<Empleado, Long> getDao() {
        return empleadoRepo;
    }
}
