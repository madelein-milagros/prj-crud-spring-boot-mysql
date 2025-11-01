package com.tecsup.prj_crud_spring_boot_mysql.persistence;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoDao extends JpaRepository<Curso, Long> {
}