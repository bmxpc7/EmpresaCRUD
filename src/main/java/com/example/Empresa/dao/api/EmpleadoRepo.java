package com.example.Empresa.dao.api;

import com.example.Empresa.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepo extends MongoRepository<Empleado,Long> {
}
