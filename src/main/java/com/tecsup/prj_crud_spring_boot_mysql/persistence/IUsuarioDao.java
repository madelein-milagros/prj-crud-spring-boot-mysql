package com.tecsup.prj_crud_spring_boot_mysql.persistence;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);
}