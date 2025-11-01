package com.tecsup.prj_crud_spring_boot_mysql.services;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Curso;
import java.util.List;

public interface CursoService {

    List<Curso> findAll();
    Curso findById(Long id);
    Curso save(Curso curso);
    void delete(Long id);
}