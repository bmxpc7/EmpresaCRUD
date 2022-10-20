package com.example.Empresa.controller;

import com.example.Empresa.model.Empleado;
import com.example.Empresa.service.api.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado/api/v1")
@CrossOrigin("*")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping(value = "/all")
    public List<Empleado> getAll() {
        return empleadoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Empleado find(@PathVariable Long id) {
        return empleadoService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Empleado> save(@RequestBody Empleado empleado) {
        Empleado obj = empleadoService.save(empleado);
        return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Empleado> delete(@PathVariable Long id) {
        Empleado empleado = empleadoService.get(id);
        if (empleado != null) {
            empleadoService.delete(id);
        } else {
            return new ResponseEntity<Empleado>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
    }
}
